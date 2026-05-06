import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employ-show',
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-show.html',
  styleUrl: './employ-show.css',
})
export class EmployShow {
  employs : Observable<Employ[]>

  constructor(private _employService : EmployService) {
    this.employs = this._employService.showEmploy();
  }
}

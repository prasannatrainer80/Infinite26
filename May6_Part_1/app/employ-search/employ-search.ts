import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-employ-search',
  imports: [CommonModule,FormsModule],
  templateUrl: './employ-search.html',
  styleUrl: './employ-search.css',
})
export class EmploySearch {

  empno : number;
  employFound : Observable<Employ>

  constructor(private _employService : EmployService) {

  }

  show() {
    this.employFound = this._employService.searchEmploy(this.empno)
  }
}

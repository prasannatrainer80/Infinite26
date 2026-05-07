import { Component } from '@angular/core';
import { Employ } from '../employ';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { EmployService } from '../employ-service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-show-employ',
  imports: [CommonModule,FormsModule],
  templateUrl: './show-employ.html',
  styleUrl: './show-employ.css',
})
export class ShowEmploy {
  employs : Observable<Employ[]>
  token : string;
  constructor(private _authService : EmployService) {
    this.token = localStorage.getItem("jwt")
    this.employs = this._authService.showEmploy(this.token)
   
    localStorage.removeItem("jwt");
  }


}

import { Component } from '@angular/core';
import { EmployService } from '../employ-service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employ-delete',
  imports: [FormsModule,CommonModule],
  templateUrl: './employ-delete.html',
  styleUrl: './employ-delete.css',
})
export class EmployDelete {

  deleteEmploy() {
    this._employService.deleteEmploy(this.empno).subscribe(x => {
      alert(x);
    })
  }
  empno : number;
  constructor(private _employService : EmployService) {}
}

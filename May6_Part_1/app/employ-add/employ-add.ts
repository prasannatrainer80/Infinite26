import { Component } from '@angular/core';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-employ-add',
  imports: [FormsModule,CommonModule],
  templateUrl: './employ-add.html',
  styleUrl: './employ-add.css',
})
export class EmployAdd {

  employ  : Employ;

  constructor(private _employService : EmployService) {
    this.employ = new Employ();
  }

  addEmploy() {
    this._employService.addEmploy(this.employ).subscribe(x =>{
      alert(x);
    })
  }

}

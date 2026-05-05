import { Component } from '@angular/core';
import { Employ } from '../employ';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { EmployService } from '../employ-service';

@Component({
  selector: 'app-employ-update',
  imports: [FormsModule,CommonModule],
  templateUrl: './employ-update.html',
  styleUrl: './employ-update.css',
})
export class EmployUpdate {

  employ  : Employ;
  
    constructor(private _employService : EmployService) {
      this.employ = new Employ();
    }
  
    updateEmploy() {
      this._employService.updateEmploy(this.employ).subscribe(x =>{
        alert(x);
      })
    }
}

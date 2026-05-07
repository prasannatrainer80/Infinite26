import { Component } from '@angular/core';
import { Employ } from '../employ';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-add-employ',
  imports: [FormsModule,CommonModule],
  templateUrl: './add-employ.html',
  styleUrl: './add-employ.css',
})

export class AddEmploy {
  
  employ : Employ;
  isValid : boolean;
  msg :string;
  
  constructor() {
    this.employ = new Employ();
    this.isValid = false;
  }

  addEmploy(employForm : NgForm) {
    if (employForm.invalid) {
      return;
    }
    this.isValid=true;
  }

}

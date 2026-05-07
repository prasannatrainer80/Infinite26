import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-validation-example',
  imports: [FormsModule,CommonModule],
  templateUrl: './validation-example.html',
  styleUrl: './validation-example.css',
})
export class ValidationExample {
    
  sno : number;
  sname : any;
  city : any;
  cgp : number;
  isValid : boolean;
  
  constructor() {
    this.isValid = false;
  }

  show(validationForm :NgForm) {
    if (validationForm.invalid) {
      return;
    }
    // console.log('dirty  ', this.sno.dirty);
    this.isValid = true;
  }


}

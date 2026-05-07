import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  imports: [FormsModule,CommonModule],
  templateUrl: './login.html',
  styleUrl: './login.css',
})
export class Login {
  user : string;
  pwd : string;
  isValid : boolean;

  constructor() {
    this.isValid = false;
  }

  login(loginForm : NgForm) {
    if (loginForm.invalid) {
      return;
    }
    this.isValid = true;
  }

}

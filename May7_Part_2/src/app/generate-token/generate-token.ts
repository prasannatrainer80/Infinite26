import { Component } from '@angular/core';
import { AuthRequest } from '../auth-request';
import { EmployService } from '../employ-service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-generate-token',
  imports: [CommonModule,FormsModule],
  templateUrl: './generate-token.html',
  styleUrl: './generate-token.css',
})
export class GenerateToken {

    userName : string;
  passWord : string;
  result : any;
  authRequest : AuthRequest;
  jwt : string;
  generate() {
    this.authRequest.username = this.userName;
    this.authRequest.password = this.passWord;
    // alert(this.authRequest.username);
    // alert(this.authRequest.username);
   
    this._authService.generateTokenNew(this.authRequest).subscribe(x => {
      localStorage.setItem("jwt",x);
      this.jwt = x;
      // alert(x);
      // this.result = x;
    })
  }
  constructor(private _authService : EmployService) {
    this.authRequest = new AuthRequest();
 
 
  }

}

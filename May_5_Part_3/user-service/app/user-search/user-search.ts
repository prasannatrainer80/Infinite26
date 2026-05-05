import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { User } from '../user';
import { Observable } from 'rxjs';
import { UserService } from '../user-service';

@Component({
  selector: 'app-user-search',
  imports: [CommonModule, FormsModule],
  templateUrl: './user-search.html',
  styleUrl: './user-search.css',
})
export class UserSearch {
  id : number;

  user : Observable<User>;

  constructor(private _userService : UserService) {

  }

  show() {
    alert("Hi" +this.id);
    this.user = this._userService.getUser(this.id);
    console.log(this.user);
  }

}

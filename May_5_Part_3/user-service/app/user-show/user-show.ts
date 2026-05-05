import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import { User } from '../user';
import { UserService } from '../user-service';

@Component({
  selector: 'app-user-show',
  imports: [CommonModule,FormsModule],
  templateUrl: './user-show.html',
  styleUrl: './user-show.css',
})
export class UserShow {

  users: Observable<User[]>

  constructor(private userService: UserService) {
    this.users = this.userService.getUsers();
  }
}

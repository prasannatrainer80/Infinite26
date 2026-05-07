import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Login } from './login/login';
import { ValidationExample } from './validation-example/validation-example';
import { AddEmploy } from './add-employ/add-employ';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,Login,ValidationExample,AddEmploy],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('FormsExample');
}

import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { EmployShow } from './employ-show/employ-show';
import { EmploySearch } from './employ-search/employ-search';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,EmployShow,EmploySearch],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('AngEmployServiceEx');
}

import { Component, signal } from '@angular/core';
import { RouterModule, RouterOutlet } from '@angular/router';
import { EmployShow } from './employ-show/employ-show';
import { EmploySearch } from './employ-search/employ-search';
import { EmployAdd } from './employ-add/employ-add';
import { EmployUpdate } from './employ-update/employ-update';
import { EmployDelete } from './employ-delete/employ-delete';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,EmployShow,EmploySearch,EmployAdd,
    EmployUpdate,EmployDelete,RouterModule],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('AngEmployServiceEx');
}

import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { TableEx1 } from './table-ex1/table-ex1';
import { MatSortEx } from './mat-sort-ex/mat-sort-ex';
import { EmployShow } from './employ-show/employ-show';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,TableEx1,MatSortEx,EmployShow],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('MatExampleNew');
}

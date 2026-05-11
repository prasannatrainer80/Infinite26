import { Component, ViewChild } from '@angular/core';
import { EmployService } from '../employ-service';
import { Observable } from 'rxjs';
import { Employ } from '../employ';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { MatCardModule } from '@angular/material/card';
import { MatSort, MatSortModule } from '@angular/material/sort';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';

@Component({
  selector: 'app-employ-show',
  imports: [
     FormsModule,
    CommonModule,
    MatTableModule,
    // CommonModule,
    MatInputModule,
    MatSelectModule,
    MatCardModule,
    MatSortModule,
    MatPaginatorModule
  ],
  templateUrl: './employ-show.html',
  styleUrl: './employ-show.css',
})
export class EmployShow {

 displayedColumns: string[] = [
    'empno',
    'name',
    'gender',
    'dept',
    'desig',
    'basic'
  ];

    dataSource = new MatTableDataSource<Employ>;
  @ViewChild(MatSort) sort = {} as MatSort;
  @ViewChild(MatPaginator) paginator = {} as MatPaginator;



  employs : Observable<Employ[]>;
  constructor(private _employService : EmployService) {
  this._employService.showEmploy().subscribe(data => {

  this.dataSource = new MatTableDataSource(data);

  this.dataSource.sort = this.sort;
  this.dataSource.paginator = this.paginator;

});

  }
}

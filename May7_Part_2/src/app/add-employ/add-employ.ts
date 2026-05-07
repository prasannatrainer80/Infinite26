import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { Employ } from '../employ';
import { EmployService } from '../employ-service';

@Component({
  selector: 'app-add-employ',
  imports: [CommonModule,FormsModule],
  templateUrl: './add-employ.html',
  styleUrl: './add-employ.css',
})
export class AddEmploy {

  employ : Employ;

  addEmploy(employForm: NgForm) {

  console.log(this.employ);

  this._employService.addEmploy(this.employ).subscribe({

    next: (data) => {

      alert(data);
    },

    error: (err) => {

      console.log(err);
      alert("Error Occurred");
    }
  });
}

  constructor(private _employService : EmployService) {
    this.employ = new Employ();
  }
  
}

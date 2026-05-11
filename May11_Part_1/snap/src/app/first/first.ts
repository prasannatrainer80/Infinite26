import { Component } from '@angular/core';
import { Router, RouterLink, RouterOutlet } from "@angular/router";

@Component({
  selector: 'app-first',
  imports: [RouterLink, RouterOutlet],
  templateUrl: './first.html',
  styleUrl: './first.css',
})
export class First {

  trainer : string;
  company : string;
  constructor(private _router : Router) {
    this.trainer = "Prasanna";
    this.company = "Infinite";
  }

  third() {
    // this._router.navigate(['third',this.trainer,this.company]);
   this._router.navigate([
    '/first',
    {
      outlets: {
        infinite: ['third', this.trainer, this.company]
      }
    }
  ]);

  }
}

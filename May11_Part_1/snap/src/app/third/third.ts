import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-third',
  imports: [],
  templateUrl: './third.html',
  styleUrl: './third.css',
})
export class Third {

  trainer : string;
  company : string;
  
  constructor(private _activatedRoute : ActivatedRoute) {
    this.trainer = this._activatedRoute.snapshot.params["trainer"];
    this.company = this._activatedRoute.snapshot.params["company"];
  }
}

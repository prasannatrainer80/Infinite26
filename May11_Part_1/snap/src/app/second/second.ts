import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-second',
  imports: [],
  templateUrl: './second.html',
  styleUrl: './second.css',
})
export class Second {

  company : string;
  trainer : string;

  constructor(private _activatedRoute : ActivatedRoute) {
    this.company = this._activatedRoute.snapshot.params["company"];
    this.trainer = this._activatedRoute.snapshot.params["trainer"];
  }

}

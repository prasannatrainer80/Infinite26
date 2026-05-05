import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root',
})
export class EmployService {
  
  constructor(private _http : HttpClient) {

  }

  searchEmploy(eno : number) : Observable<Employ> {
    return this._http.get<Employ>("http://localhost:9991/employ/searchEmploy/" +eno);
  }

  showEmploy() : Observable<Employ[]> {
    return this._http.get<Employ[]>("http://localhost:9991/employ/showemploy")
  }
}

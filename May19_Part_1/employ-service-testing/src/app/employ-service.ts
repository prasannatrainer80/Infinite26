import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, ObservedValueOf } from 'rxjs';
import { Employ } from './employ';

@Injectable({
  providedIn: 'root',
})

export class EmployService {
  
  constructor(private _http : HttpClient) {

  }

  deleteEmploy(empno : number) : Observable<any> {
    return this._http.delete("http://localhost:9991/employ/deleteEmploy/"+empno)
  }

  updateEmploy(employ : Employ) : Observable<any> {
    return this._http.put("http://localhost:9991/employ/updateEmploy",employ)
  }

  addEmploy(employ : Employ) : Observable<any> {
    return this._http.post("http://localhost:9991/employ/addEmploy",employ)
  }

  searchEmploy(eno : number) : Observable<Employ> {
    return this._http.get<Employ>("http://localhost:9991/employ/searchEmploy/" +eno);
  }

  showEmploy() : Observable<Employ[]> {
    return this._http.get<Employ[]>("http://localhost:9991/employ/showemploy")
  }


}

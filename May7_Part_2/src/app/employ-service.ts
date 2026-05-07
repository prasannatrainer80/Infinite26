import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employ } from './employ';
import { Observable, tap } from 'rxjs';
import { AuthRequest } from './auth-request';

@Injectable({
  providedIn: 'root',
})
export class EmployService {
  
  constructor(private _httpClient : HttpClient) {

  }

  showEmploy(token : string) : Observable<Employ[]> {
  var headers_object = new HttpHeaders({
    "Content-Type":"application/json",
    "Authorization":"Bearer "+token
  });

  const httpOptions = {
    headers : headers_object
  }

 return this._httpClient.get<Employ[]>("http://localhost:1122/employ/showEmploy",httpOptions)
}
  generateTokenNew(authRequest : AuthRequest) : Observable<any> {
    return this._httpClient.post("http://localhost:1122/employ/generateToken",authRequest, {responseType:'text'}).pipe(
      tap((resp) => {
        alert(resp);
      })
    )
  }
  
  addEmploy(employ: Employ): Observable<any> {

  return this._httpClient.post(
    "http://localhost:1122/employ/addEmploy",
    employ,
    { responseType: 'text' }
  );
}
}

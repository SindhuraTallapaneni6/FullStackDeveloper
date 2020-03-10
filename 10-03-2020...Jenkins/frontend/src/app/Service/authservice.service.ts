import { Injectable } from '@angular/core';
import { UserService } from './user.service';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { map } from 'rxjs/operators';
const url = "http://localhost:8765/user-service/register";


@Injectable({
  providedIn: 'root'
})
export class AuthserviceService {

  constructor(private userervice: UserService, private http:HttpClient) { }

  authenticate(username : string,password : string)
  {
    let authenticationToken = "Basic" + window.btoa(username + " : " +password);
    console.log(authenticationToken);
    let headers=new HttpHeaders({
      Authorization : authenticationToken
    });
    return this.http.get(url, { headers }).pipe(
      // success function
      map(successData => {
        console.log("success ")
        sessionStorage.setItem("username", username);
        // save the token
        sessionStorage.setItem("token", authenticationToken);
        return successData;
      }),
      // failure function
      map(failureData => {
        // console message 
        console.log("failure")
        return failureData;
      })
    );
  }

  getAuthenticationToken() {
    if (this.isUserLoggedIn())
      return sessionStorage.getItem("token");
    return null;
  }
  isUserLoggedIn(): boolean {
    let user = sessionStorage.getItem('username');
    if (user == null)
      return false;
    return true;
  }
  getProfileUrl(): string {
    let url = sessionStorage.getItem("profile");
    return url;
  }
  logout() {
    sessionStorage.removeItem('username');
    sessionStorage.removeItem("token")
  }
  getUserDetails(): string {
    let user = sessionStorage.getItem('username');
    return user;
  }

}

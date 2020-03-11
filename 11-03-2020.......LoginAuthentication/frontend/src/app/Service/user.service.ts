import { Injectable, Inject } from '@angular/core';
import { from } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {
    httpUrl='http://localhost:8765/user-service/register/';
   user1:User;
  constructor(private httpClient: HttpClient , @Inject (HttpClient) private ht) { }
  LoggedIn(){
    let user_id = localStorage.getItem('userId');
    if(user_id == null){
      return false;
    }else{
      return true;
    }
  }
  isActivated(user:User){
    if(user.active == true){
      return true;
    }
  }
  isAdmin(){
    if(sessionStorage.getItem("userType")=="admin"){
      return true;
    }
    else{
        return false;
    }
  }
  getAllUsers():Observable<User[]>
  {
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user1 :User)
  {
    return this.ht.post(this.httpUrl,user1);
  }
  deleteUser(id: number): Observable<User>{
    return this.ht.delete(`http://localhost:8765/user-service/register/${id}`);
  }
  updateUserInfo(user1: User): Observable<User>{
   return this.ht.put(this.httpUrl,user1);
}
getUserById(id: number): Observable<User>{
  return this.ht.get(`http://localhost:8765/user-service/register/${id}`);
}
reg(){
  return this.ht.get(`http://localhost:8765/user-service/reg`);
}
serviceActivation(obj){
  return this.ht.put(`http://localhost:8765/user-service/activate`,obj);

}

}

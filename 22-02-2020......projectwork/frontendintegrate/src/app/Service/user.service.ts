import { Injectable, Inject } from '@angular/core';
import { USERS } from '../models/user-mock';
import { from } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {
    httpUrl='http://localhost:8080/register/';
  //  user1:User[];
  constructor(private httpClient: HttpClient , @Inject (HttpClient) private ht) { }
  getAllUsers():Observable<User[]>
  {
    return this.httpClient.get<User[]>(this.httpUrl);
  }
  saveUser(user1 :User):Observable<User>
  {
    return this.ht.post(this.httpUrl,user1);
  }
  deleteUser(id: number): Observable<User>{
    return this.ht.delete(`http://localhost:8080/register/${id}`);
  }
  updateUserInfo(user1: User): Observable<User>{
   return this.ht.put(this.httpUrl,user1);
}
getUserById(id: number): Observable<User>{
  return this.ht.get(`http://localhost:8080/register/${id}`);
}

}

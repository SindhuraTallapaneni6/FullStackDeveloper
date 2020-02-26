import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ipo } from '../models/ipo';

@Injectable({
  providedIn: 'root'
})
export class IpoService {

  httpUrl='http://localhost:8080/ipo/';
  ipo:Ipo[];
constructor(private httpClient: HttpClient, @Inject (HttpClient) private ht) { }
getAllIpos():Observable<Ipo[]>
{
  return this.httpClient.get<Ipo[]>(this.httpUrl);
}
saveIpo(ipo :Ipo):Observable<Ipo>
{
  return this.httpClient.post<Ipo>(this.httpUrl,ipo);
}
deleteIpo(id: number): Observable<Ipo>{
  return this.ht.delete(`http://localhost:8080/ipo/${id}`);
}
updateIpoInfo(ipo: Ipo): Observable<Ipo>{
 return this.ht.put(`http://localhost:8080/ipo/`,ipo);
}
getIpoById(id: number): Observable<Ipo>{
return this.ht.get(`http://localhost:8080/ipo/${id}`);
}
}

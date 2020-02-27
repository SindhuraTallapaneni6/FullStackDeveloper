import { Injectable, Inject } from '@angular/core';
import { StockExchange } from '../models/stockexchange';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StockexchangeService {
  
  httpUrl='http://localhost:8080/stockexchange/';
  stockexchange:StockExchange[];

  constructor(private httpClient: HttpClient, @Inject (HttpClient) private ht) { }
  getAllStocks():Observable<StockExchange[]>
{
  return this.httpClient.get<StockExchange[]>(this.httpUrl);
}
saveStock(stockexchange :StockExchange):Observable<StockExchange>
{
  return this.httpClient.post<StockExchange>(this.httpUrl,stockexchange);
}
deleteStock(id: number): Observable<StockExchange>{
  return this.ht.delete(`http://localhost:8080/stockexchange/${id}`);
}
updateStockInfo(stockexchange: StockExchange): Observable<StockExchange>{
 return this.ht.put(`http://localhost:8080/stockexchange/`,stockexchange);
}
getStockById(id: number): Observable<StockExchange>{
return this.ht.get(`http://localhost:8080/stockexchange/${id}`);
}
}



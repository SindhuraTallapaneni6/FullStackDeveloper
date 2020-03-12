import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UploadService {

  httpUrl = "http://localhost:8006/stockprice/"
  constructor(private httpClient: HttpClient) { }

  uploadStockSheet(formData: FormData): Observable<object>{
    return this.httpClient.post<object>(this.httpUrl+"uploadStocksSheet",formData);
  }

  
}

import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';
import { University } from 'src/app/model/university';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class UniversityService {

  private UNIVERSITY_URL = "http://localhost:3000/universities";

  constructor(private http: HttpClient) { }

  getUniversities(): Observable<University[]>{
    return this.http.get<University[]>(this.UNIVERSITY_URL);
  }

  addNewUniversity(university: University): Observable<any>{
    return this.http.post(this.UNIVERSITY_URL, university);
  }



}

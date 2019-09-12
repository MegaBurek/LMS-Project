import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

class LoginRes {
  token: string;
  role: string;
  username: string;
}

@Injectable({
  providedIn: 'root'
})

export class LoginService {
  url = 'http://localhost:8080/login';

  authToken = null;
  httpOptions = null;
  isEmpty: boolean;

  constructor(private http: HttpClient) { }

  login(username: string, password: string) {
    let user = { "username": username, "password": password }
    this.http.post<LoginRes>(`${this.url}`, user).subscribe(res => {
      if (res.token) {
        this.isEmpty = true;
        this.authToken = res.token;
        localStorage.setItem("token", res.token);
        localStorage.setItem("role", res.role);
        localStorage.setItem("username", res.username);
      }
    });
    return this.isEmpty;
  }


}

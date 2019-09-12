import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../services/login-service/log-in.service';
import { MatDialog } from '@angular/material/dialog';
import { LoginErrorDialogComponenet } from './loginErrorDialog.component';

enum roleEnum {
  admin = "ROLE_ADMIN",
  administrator = "ROLE_ADMINISTRATOR",
  teacher = "ROLE_TEACHER",
  student = "ROLE_STUDENT",
}

@Component({
  selector: 'app-login',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  teacherRole: boolean = false;
  studentRole: boolean = false;
  adminRole: boolean = false;
  roleEnum: any;
  role: string;

  username: String;
  password: String;

  loginForm: FormGroup;
  location: any;

  constructor(
    private fb: FormBuilder,
    private router: Router,
    private dialog: MatDialog,
    private ls: LoginService) {
    this.createForm();
  }

  createForm() {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  login(username: string, password: string) {
    console.log(username)
    if (this.ls.login(username, password)) {
      console.log(username)
      this.role = localStorage.getItem("role");
      if ((this.role == roleEnum.admin)) {
        this.router.navigateByUrl('/admin-panel')
      }
      else if (this.role == roleEnum.administrator) {
        this.router.navigateByUrl('/administrator-panel')
      }
      else if (this.role == roleEnum.teacher) {
        this.router.navigateByUrl('/teacher-panel')
      }
      else if (this.role == roleEnum.student) {
        this.router.navigateByUrl('/student-panel')
      }
    }
    else {
      this.dialog.open(LoginErrorDialogComponenet, {
        data: {
          message: 'Incorrect Username or Password',
          buttonText: {
            cancel: 'Close'
          }
        },
      });
    }

  }

  ngOnInit() {
    localStorage.clear();
  }

}

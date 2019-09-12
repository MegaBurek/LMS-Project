import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms'
import { AdminService } from '../../services/admin-service/admin.service';
import { MatDialogRef } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material';
import { RegisterService } from '../../services/register-service/register.service';
import { Student } from 'src/app/model/student';
import { Teacher } from 'src/app/model/teacher';
import { Administration } from 'src/app/model/administration';
import { Admin } from 'src/app/model/admin';

enum roleEnum {
  admin = "ROLE_ADMIN",
  administrator = "ROLE_ADMINISTRATOR",
  student = "ROLE_STUDENT",
  teacher = "ROLE_TEACHER"

}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {
  
  student: Student = new Student();
  teacher: Teacher = new Teacher();
  administrator: Administration = new Administration();
  admin: Admin = new Admin();

  studentForm: FormGroup;
  teacherForm: FormGroup;
  adminForm: FormGroup;
  administratorForm: FormGroup;
  loginForm: FormGroup;
  roleForm: FormGroup;

  roleEnum: roleEnum;
  role: string = '';
  roles: string[] = ['Student', 'Teacher', 'Administration', 'Admin'];

  showAdminFields: boolean = false;
  showStudentFields: boolean = false;
  showTeacherFields: boolean = false;
  showAdministratorFields: boolean = false;

  constructor(
    private registerService: RegisterService,
    private fb: FormBuilder,
    public dialogRef: MatDialogRef<RegisterComponent>
  ) {
    this.createFormAdmin();

    this.createFormStudent();

    this.createFormTeacher();

    this.createFormAdministrator();

    this.createFormLogin();

    this.createRoleForm();
  }

  createRoleForm(){
    this.roleForm = this.fb.group({
      role: ['', Validators.required]
    });
  }

  createFormLogin() {
    this.loginForm = this.fb.group({
      username: ['', Validators.required],
      password: ['', Validators.required],
      confirmPassword: ['', Validators.required]
    });
  }

  createFormStudent() {
    this.studentForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      cardNumber: ['', Validators.required]
    });
  }

  createFormTeacher() {
    this.teacherForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required],
      personalIdentificationNumber: ['', Validators.required]
    });
  }

  createFormAdmin() {
    this.adminForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required]
    });
  }

  createFormAdministrator() {
    this.administratorForm = this.fb.group({
      firstName: ['', Validators.required],
      lastName: ['', Validators.required]
    });
  }

  ngOnInit() {
  }

  registerStudent() {
    const user = this.studentForm.value;
    this.student = user;
    this.student['user'] = this.loginForm.value;
    delete this.student['user']['confirmPassword']
    this.student['user']['role'] = roleEnum.student;
    this.registerService.registerStudent(this.student).subscribe();
  }

  registerTeacher() {
    const user = this.teacherForm.value;
    this.teacher = user;
    this.teacher['user'] = this.loginForm.value;
    delete this.teacher['user']['confirmPassword']
    this.teacher['user']['role'] = roleEnum.teacher;
    this.registerService.registerTeacher(this.teacher).subscribe();
  }

  registerAdmin() {
    const user = this.adminForm.value;
    this.admin = user;
    this.admin['user'] = this.loginForm.value;
    delete this.admin['user']['confirmPassword']
    this.admin['user']['role'] = roleEnum.admin;
    this.registerService.registerAdmin(this.admin).subscribe();
  }

  registerAdministrator() {
    const user = this.administratorForm.value;
    this.administrator = user;
    this.administrator['user'] = this.loginForm.value;
    delete this.administrator['user']['confirmPassword']
    this.administrator['user']['role'] = roleEnum.administrator;
    this.registerService.registerAdministrator(this.administrator).subscribe();
  }

}



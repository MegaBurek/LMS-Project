import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Student } from 'src/app/model/student';
import { Teacher } from 'src/app/model/teacher';
import { Admin } from 'src/app/model/admin';
import { Administration } from 'src/app/model/administration';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  private BASE_URL = "http://localhost:8080/admin/register";
  private STUDENT_URL = `${this.BASE_URL}\\student`;
  private ADMINISTRATOR_URL = `${this.BASE_URL}\\administrator`;
  private ADMIN_URL = `${this.BASE_URL}\\admin`;
  private TEACHER_URL = `${this.BASE_URL}\\teacher`;

  constructor(private http: HttpClient) { }

  registerStudent(student: Student) : Observable<any>{
    return this.http.post(this.STUDENT_URL, student);
  }

  registerTeacher(teacher: Teacher): Observable<any> {
    return this.http.post(this.TEACHER_URL, teacher);
  }

  registerAdmin(admin: Admin) {
    return this.http.post(this.ADMIN_URL, admin);
  }

  registerAdministrator(administrator: Administration) {
    return this.http.post(this.ADMINISTRATOR_URL, administrator);
  }
}

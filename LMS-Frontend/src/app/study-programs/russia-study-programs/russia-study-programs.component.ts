import { Component, OnInit } from '@angular/core';
import { University } from 'src/app/model/university';
import { UniversityService } from 'src/app/services/university-service/university.service';
import { Faculty } from 'src/app/model/faculty';
import { Course } from 'src/app/model/course';

@Component({
  selector: 'app-russia-study-programs',
  templateUrl: './russia-study-programs.component.html',
  styleUrls: ['./russia-study-programs.component.scss']
})
export class RussiaStudyProgramsComponent implements OnInit {

  universities: University[];
  faculties: Faculty[];
  courses: Course[];

  constructor(
    private universityService : UniversityService
  ) { }

  ngOnInit() {
    this.getUniversities();
  }

  getUniversities(){
    this.universityService.getUniversities()
    .subscribe(universities => this.universities = universities);
    this.fillFaculties();
  }

  fillFaculties(){
    for (const university of this.universities){
      this.faculties.push(university.faculty)
    }
    this.fillCourses();
  }

  fillCourses(){
    for (const faculty of this.faculties){
      this.courses.push(faculty.course)
    }
  }

}

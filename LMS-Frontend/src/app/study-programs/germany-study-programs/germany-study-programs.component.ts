import { Component, OnInit } from '@angular/core';
import { UniversityService } from 'src/app/services/university-service/university.service';
import { University } from 'src/app/model/university';
import { Faculty } from 'src/app/model/faculty';
import { Course } from 'src/app/model/course';

@Component({
  selector: 'app-germany-study-programs',
  templateUrl: './germany-study-programs.component.html',
  styleUrls: ['./germany-study-programs.component.scss']
})
export class GermanyStudyProgramsComponent implements OnInit {

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
    this.universities.splice(1)
    this.universities.splice(2)
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

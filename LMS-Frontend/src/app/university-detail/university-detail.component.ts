import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-university-detail',
  templateUrl: './university-detail.component.html',
  styleUrls: ['./university-detail.component.scss']
})
export class UniversityDetailComponent implements OnInit {

  constructor() { }

  country: String;

  ngOnInit() {
  }

}

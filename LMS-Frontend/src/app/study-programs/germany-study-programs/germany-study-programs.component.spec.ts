import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GermanyStudyProgramsComponent } from './germany-study-programs.component';

describe('GermanyStudyProgramsComponent', () => {
  let component: GermanyStudyProgramsComponent;
  let fixture: ComponentFixture<GermanyStudyProgramsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GermanyStudyProgramsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GermanyStudyProgramsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

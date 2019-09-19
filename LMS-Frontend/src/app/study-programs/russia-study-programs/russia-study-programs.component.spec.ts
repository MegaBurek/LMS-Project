import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RussiaStudyProgramsComponent } from './russia-study-programs.component';

describe('RussiaStudyProgramsComponent', () => {
  let component: RussiaStudyProgramsComponent;
  let fixture: ComponentFixture<RussiaStudyProgramsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RussiaStudyProgramsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RussiaStudyProgramsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BulgariaStudyProgramsComponent } from './bulgaria-study-programs.component';

describe('BulgariaStudyProgramsComponent', () => {
  let component: BulgariaStudyProgramsComponent;
  let fixture: ComponentFixture<BulgariaStudyProgramsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BulgariaStudyProgramsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BulgariaStudyProgramsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GermanyUniversityComponent } from './germany-university.component';

describe('GermanyUniversityComponent', () => {
  let component: GermanyUniversityComponent;
  let fixture: ComponentFixture<GermanyUniversityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GermanyUniversityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GermanyUniversityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

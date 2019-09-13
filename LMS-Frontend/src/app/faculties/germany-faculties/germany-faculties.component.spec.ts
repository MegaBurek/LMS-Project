import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GermanyFacultiesComponent } from './germany-faculties.component';

describe('GermanyFacultiesComponent', () => {
  let component: GermanyFacultiesComponent;
  let fixture: ComponentFixture<GermanyFacultiesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GermanyFacultiesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GermanyFacultiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

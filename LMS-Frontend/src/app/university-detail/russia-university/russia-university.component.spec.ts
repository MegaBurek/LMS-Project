import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RussiaUniversityComponent } from './russia-university.component';

describe('RussiaUniversityComponent', () => {
  let component: RussiaUniversityComponent;
  let fixture: ComponentFixture<RussiaUniversityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RussiaUniversityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RussiaUniversityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

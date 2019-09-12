import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BulgariaUniversityComponent } from './bulgaria-university.component';

describe('BulgariaUniversityComponent', () => {
  let component: BulgariaUniversityComponent;
  let fixture: ComponentFixture<BulgariaUniversityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BulgariaUniversityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BulgariaUniversityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

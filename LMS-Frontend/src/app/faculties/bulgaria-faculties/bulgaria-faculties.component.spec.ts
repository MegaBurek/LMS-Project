import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BulgariaFacultiesComponent } from './bulgaria-faculties.component';

describe('BulgariaFacultiesComponent', () => {
  let component: BulgariaFacultiesComponent;
  let fixture: ComponentFixture<BulgariaFacultiesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BulgariaFacultiesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BulgariaFacultiesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

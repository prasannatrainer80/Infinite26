import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmploy } from './add-employ';

describe('AddEmploy', () => {
  let component: AddEmploy;
  let fixture: ComponentFixture<AddEmploy>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddEmploy]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddEmploy);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

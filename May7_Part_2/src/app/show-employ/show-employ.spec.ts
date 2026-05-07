import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowEmploy } from './show-employ';

describe('ShowEmploy', () => {
  let component: ShowEmploy;
  let fixture: ComponentFixture<ShowEmploy>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ShowEmploy]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowEmploy);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

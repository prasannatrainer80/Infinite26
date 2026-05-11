import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatSortEx } from './mat-sort-ex';

describe('MatSortEx', () => {
  let component: MatSortEx;
  let fixture: ComponentFixture<MatSortEx>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MatSortEx]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MatSortEx);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

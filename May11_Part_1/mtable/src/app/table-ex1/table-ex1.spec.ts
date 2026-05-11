import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TableEx1 } from './table-ex1';

describe('TableEx1', () => {
  let component: TableEx1;
  let fixture: ComponentFixture<TableEx1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TableEx1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TableEx1);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

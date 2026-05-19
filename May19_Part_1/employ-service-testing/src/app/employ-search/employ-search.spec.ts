import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';

import { EmploySearch } from './employ-search';
import { EmployService } from '../employ-service';

describe('EmploySearch Component', () => {

  let component: EmploySearch;
  let fixture: ComponentFixture<EmploySearch>;

  const mockEmploy = {
    empno: 1,
    name: 'Prasanna',
    gender: 'Male',
    dept: 'Java',
    desig: 'Developer',
    basic: 50000
  };

  const mockEmployService = {

    searchEmploy: (empno: number) => of(mockEmploy)

  };

  beforeEach(async () => {
    
    await TestBed.configureTestingModule({
      imports: [EmploySearch],
      providers: [
        {
          provide: EmployService,
          useValue: mockEmployService
        }
      ]
    }).compileComponents();

    fixture = TestBed.createComponent(EmploySearch);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

  });

  it('should set employ observable on show()', () => {

    component.empno = 1;

    component.show();

    expect(component.employFound)
      .toBeTruthy();

  });

  it('should fetch employ details', (done) => {

    component.empno = 1;

    component.show();

    component.employFound.subscribe((data) => {

      expect(data.name)
        .toBe('Prasanna');

      expect(data.dept)
        .toBe('Java');

      // done();

    });

  });

  it('should render search button', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const button =
      compiled.querySelector(
        'input[type="button"]'
      ) as HTMLInputElement;

    expect(button.value)
      .toBe('Search');

  });

  it('should contain one number textbox', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const textbox =
      compiled.querySelectorAll(
        'input[type="number"]'
      );

    expect(textbox.length)
      .toBe(1);

  });

  it('should render employ details after show()', async () => {

    component.empno = 1;

    component.show();

    fixture.detectChanges();

    await fixture.whenStable();

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Prasanna');

    expect(compiled.textContent)
      .toContain('Java');

    expect(compiled.textContent)
      .toContain('Developer');

  });

});
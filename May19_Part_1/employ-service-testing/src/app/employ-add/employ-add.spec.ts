import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { vi } from 'vitest';

import { EmployAdd } from './employ-add';
import { EmployService } from '../employ-service';

describe('EmployAdd Component', () => {

  let component: EmployAdd;
  let fixture: ComponentFixture<EmployAdd>;

  const mockEmployService = {

    addEmploy: vi.fn().mockReturnValue(
      of('Employ Added Successfully')
    )

  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [EmployAdd],

      providers: [
        {
          provide: EmployService,
          useValue: mockEmployService
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(EmployAdd);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

  });

  it('should initialize employ object', () => {

    expect(component.employ)
      .toBeTruthy();

  });

  it('should contain six input fields', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const inputs =
      compiled.querySelectorAll('input');

    // 6 text/number inputs + 1 button
    expect(inputs.length).toBe(7);

  });

  it('should contain Add Employ button', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const button =
      compiled.querySelector(
        'input[type="button"]'
      ) as HTMLInputElement;

    expect(button.value)
      .toBe('Add Employ');

  });

  it('should call addEmploy service method', () => {

    component.employ.empno = 1;
    component.employ.name = 'Prasanna';
    component.employ.gender = 'Male';
    component.employ.dept = 'Java';
    component.employ.desig = 'Developer';
    component.employ.basic = 50000;

    component.addEmploy();

    expect(mockEmployService.addEmploy)
      .toHaveBeenCalledWith(component.employ);

  });

  it('should show alert after adding employ', () => {

    vi.spyOn(window, 'alert')
      .mockImplementation(() => {});

    component.addEmploy();

    expect(window.alert)
      .toHaveBeenCalled();

  });

  it('should render employ-add works text', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('employ-add works!');

  });

});
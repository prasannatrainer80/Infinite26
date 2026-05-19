import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { vi } from 'vitest';

import { EmployUpdate } from './employ-update';
import { EmployService } from '../employ-service';

describe('EmployUpdate Component', () => {

  let component: EmployUpdate;
  
  let fixture: ComponentFixture<EmployUpdate>;

  const mockEmployService = {

    updateEmploy: vi.fn().mockReturnValue(
      of('Employ Updated Successfully')
    )

  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [EmployUpdate],

      providers: [
        {
          provide: EmployService,
          useValue: mockEmployService
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(EmployUpdate);

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

    // 6 input boxes + 1 button
    expect(inputs.length).toBe(7);

  });

  it('should contain Update Employ button', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const button =
      compiled.querySelector(
        'input[type="button"]'
      ) as HTMLInputElement;

    expect(button.value)
      .toBe('Update Employ');

  });

  it('should call updateEmploy service method', () => {

    component.employ.empno = 1;
    component.employ.name = 'Prasanna';
    component.employ.gender = 'Male';
    component.employ.dept = 'Java';
    component.employ.desig = 'Developer';
    component.employ.basic = 50000;

    component.updateEmploy();

    expect(mockEmployService.updateEmploy)
      .toHaveBeenCalledWith(component.employ);

  });

  it('should show alert after updating employ', () => {

    vi.spyOn(window, 'alert')
      .mockImplementation(() => {});

    component.updateEmploy();

    expect(window.alert)
      .toHaveBeenCalled();

  });

  it('should render employ-update works text', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('employ-update works!');

  });

});
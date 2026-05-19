import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { vi } from 'vitest';

import { EmployDelete } from './employ-delete';
import { EmployService } from '../employ-service';

describe('EmployDelete Component', () => {

  let component: EmployDelete;
  let fixture: ComponentFixture<EmployDelete>;

  const mockEmployService = {

    deleteEmploy: vi.fn().mockReturnValue(
      of('Employ Deleted Successfully')
    )

  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [EmployDelete],

      providers: [
        {
          provide: EmployService,
          useValue: mockEmployService
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(EmployDelete);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

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

  it('should contain Delete Employ button', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const button =
      compiled.querySelector(
        'input[type="button"]'
      ) as HTMLInputElement;

    expect(button.value)
      .toBe('Delete Employ');

  });

  it('should call deleteEmploy service method', () => {

    component.empno = 101;

    component.deleteEmploy();

    expect(mockEmployService.deleteEmploy)
      .toHaveBeenCalledWith(101);

  });

  it('should show alert after deleting employ', () => {

    vi.spyOn(window, 'alert')
      .mockImplementation(() => {});

    component.empno = 101;

    component.deleteEmploy();

    expect(window.alert)
      .toHaveBeenCalled();

  });

  it('should render employ-delete works text', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('employ-delete works!');

  });

});
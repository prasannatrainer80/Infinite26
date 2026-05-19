import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';

import { EmployShow } from './employ-show';
import { EmployService } from '../employ-service';

describe('EmployShow Component', () => {

  let component: EmployShow;
  let fixture: ComponentFixture<EmployShow>;

  const mockEmploys = 
  [
    {
      empno: 1,
      name: 'Prasanna',
      gender: 'Male',
      dept: 'Java',
      desig: 'Developer',
      basic: 50000
    },
    {
      empno: 2,
      name: 'Pavithra',
      gender: 'Female',
      dept: 'Angular',
      desig: 'Tester',
      basic: 40000
    }
  ];

  const mockEmployService = {

    showEmploy: () => of(mockEmploys)

  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [EmployShow],

      providers: [
        {
          provide: EmployService,
          useValue: mockEmployService
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(EmployShow);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

  });

  it('should load employ list', (done) => {

    component.employs.subscribe((data) => {

      expect(data.length).toBe(2);

      expect(data[0].name)
        .toBe('Prasanna');

      // done();

    });

  });

  it('should render table headers', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Employ No');

    expect(compiled.textContent)
      .toContain('Employ Name');

    expect(compiled.textContent)
      .toContain('Gender');

    expect(compiled.textContent)
      .toContain('Department');

    expect(compiled.textContent)
      .toContain('Designation');

    expect(compiled.textContent)
      .toContain('Basic');

  });

  it('should render employ data', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Prasanna');

    expect(compiled.textContent)
      .toContain('Java');

    expect(compiled.textContent)
      .toContain('Developer');

  });

  it('should render correct number of rows', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const rows = compiled.querySelectorAll('tr');

    // 1 header row + 2 data rows
    expect(rows.length).toBe(3);

  });

  it('should contain one table', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const tables =
      compiled.querySelectorAll('table');

    expect(tables.length).toBe(1);

  });

});
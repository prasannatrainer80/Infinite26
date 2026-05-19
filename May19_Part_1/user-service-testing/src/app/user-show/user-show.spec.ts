import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';

import { UserShow } from './user-show';
import { UserService } from '../user-service';

describe('UserShow Component', () => {

  let component: UserShow;
  let fixture: ComponentFixture<UserShow>;

  const mockUsers = [
  {
      id: 1,
      name: 'Prasanna Pappu',
      username: 'prassucp',
      email: 'prassucp@gmail.com',
      phone: '1234567890',
      website: 'hello.com'
  },
  {
      id: 2,
      name: 'Raji Selvan',
      username: 'raji',
      email: 'raji@gmail.com',
      phone: '9876543210',
      website: 'raji.com'
  }
  ];

  const mockUserService = {
    getUsers: () => of(mockUsers)
  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [UserShow],

      providers: [
        {
          provide: UserService,
          useValue: mockUserService
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(UserShow);

    component = fixture.componentInstance;
    
    fixture.detectChanges();
  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should load users from service', (done) => {

    component.users.subscribe((data) => {

    expect(data.length).toBe(2);

    expect(data[0].name)
        .toBe('Prasanna Pappu');

      // done();
    });

  });

  it('should render table headers', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent).toContain('Id');
    expect(compiled.textContent).toContain('Name');
    expect(compiled.textContent).toContain('UserName');
    expect(compiled.textContent).toContain('Email');
    expect(compiled.textContent).toContain('Phone');
    expect(compiled.textContent).toContain('Website');

  });

  it('should render user data in table', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Prasanna Pappu');

    expect(compiled.textContent)
      .toContain('Pappu');

    expect(compiled.textContent)
      .toContain('prassucp@gmail.com');

  });

  it('should render correct number of rows', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const rows = compiled.querySelectorAll('tr');

    // 1 header row + 2 data rows
    expect(rows.length).toBe(3);

  });

});
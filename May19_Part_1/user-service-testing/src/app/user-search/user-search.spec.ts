import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';

import { UserSearch } from './user-search';
import { UserService } from '../user-service';

describe('UserSearch Component', () => {

  let component: UserSearch;

  let fixture: ComponentFixture<UserSearch>;

  const mockUser = 
  {
      id: 1,
      name: 'Prasanna Pappu',
      username: 'prassucp',
      email: 'prassucp@gmail.com',
      phone: '1234567890',
      website: 'hello.com'
  }

  const mockUserService = {
    getUser: (id: number) => of(mockUser)
  };

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [UserSearch],

      providers: 
      [
      {
          provide: UserService,
          useValue: mockUserService
      }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(UserSearch);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {
    expect(component).toBeTruthy();
  });

  it('should set user observable on show()', () => {
    component.id = 1;
    component.show();
    expect(component.user).toBeTruthy();
  });

  it('should fetch user from service', (done) => {

    component.id = 1;

    component.show();

    component.user.subscribe((data) => {

      expect(data.name)
        .toBe('Prasanna Pappu');

      expect(data.username)
        .toBe('prassucp');

      // done();

    });

  });

 it('should render search button', () => {

  const compiled = fixture.nativeElement as HTMLElement;

  const button =
    compiled.querySelector('input[type="button"]') as HTMLInputElement;

  expect(button.value).toBe('Search');

});

  it('should contain one input textbox', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const inputs =
      compiled.querySelectorAll('input[type="number"]');

    expect(inputs.length).toBe(1);

  });

  it('should render user details after show()', async () => {

    component.id = 1;

    component.show();

    fixture.detectChanges();

    await fixture.whenStable();

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Prasanna Pappu');

    expect(compiled.textContent)
      .toContain('Pappu');

    expect(compiled.textContent)
      .toContain('prassucp@gmail.com');

  });

});
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { of } from 'rxjs';
import { Router } from '@angular/router';
import { vi } from 'vitest';

import { Login } from './login';
import { LoginService } from '../login-service';

describe('Login Component', () => {

  let component: Login;
  let fixture: ComponentFixture<Login>;

  let mockLoginService: any;
  let mockRouter: any;

  beforeEach(async () => {

    mockLoginService = {
      login: vi.fn().mockReturnValue(of("1"))
    };

    mockRouter = {
      navigate: vi.fn()
    };

    await TestBed.configureTestingModule({

      imports: [Login],

      providers: [
        {
          provide: LoginService,
          useValue: mockLoginService
        },
        {
          provide: Router,
          useValue: mockRouter
        }
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(Login);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

  });

  it('should contain username textbox', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const textbox =
      compiled.querySelectorAll('input[type="text"]');

    expect(textbox.length).toBe(1);

  });

  it('should contain password textbox', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const textbox =
      compiled.querySelectorAll('input[type="password"]');

    expect(textbox.length).toBe(1);

  });

  it('should call login service', () => {

    component.uname = 'prasanna';
    component.pwd = '123';

    component.login();

    expect(mockLoginService.login)
      .toHaveBeenCalledWith('prasanna', '123');

  });

  it('should navigate to menu on valid login', () => {

    vi.spyOn(window, 'alert')
      .mockImplementation(() => {});

    component.uname = 'prasanna';
    component.pwd = '123';

    component.login();

    expect(mockRouter.navigate)
      .toHaveBeenCalledWith(['/menu']);

  });

  it('should show invalid credentials alert', () => {

    vi.spyOn(window, 'alert')
      .mockImplementation(() => {});

    mockLoginService.login.mockReturnValue(of("0"));

    component.uname = 'wrong';
    component.pwd = 'wrong';

    component.login();

    expect(window.alert)
      .toHaveBeenCalledWith('Invalid Credentials...');

  });

  it('should contain login button', () => {

  fixture.detectChanges();

  const compiled = fixture.nativeElement as HTMLElement;

  const button = compiled.querySelector(
    'input[type="button"]'
  ) as HTMLInputElement;

  expect(button).toBeTruthy();

  expect(button.value)
    .toContain('Login');

});

});
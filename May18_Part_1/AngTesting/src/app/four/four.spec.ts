import { ComponentFixture, TestBed } from '@angular/core/testing';
import { vi } from 'vitest';
import { Four } from './four';

describe('Four', () => {

  let component: Four;
  let fixture: ComponentFixture<Four>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Four]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Four);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should call aashik method when button clicked', () => {
    const spy = vi.spyOn(component, 'aashik');
    const compiled = fixture.nativeElement as HTMLElement;
    const button = compiled.querySelectorAll('input')[0];
    button.dispatchEvent(new Event('click'));
    expect(spy).toHaveBeenCalled();
  });

  it('should call pavithra method when button clicked', () => {
    const spy = vi.spyOn(component, 'pavithra');
    const compiled = fixture.nativeElement as HTMLElement;
    const button = compiled.querySelectorAll('input')[1];
    button.dispatchEvent(new Event('click'));
    expect(spy).toHaveBeenCalled();
  })

  it('should call dhivya method when button clicked', () => {
    const spy = vi.spyOn(component, 'dhivya');
    const compiled = fixture.nativeElement as HTMLElement;
    const button = compiled.querySelectorAll('input')[2]; 
    button.dispatchEvent(new Event('click'));
    expect(spy).toHaveBeenCalled();
  })

});

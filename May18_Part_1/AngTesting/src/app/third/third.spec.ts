import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Third } from './third';

describe('Third', () => {
  let component: Third;
  let fixture: ComponentFixture<Third>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Third]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Third);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('Topic Contains Correct Value as `Angular 18`', () => {
    expect(component.topic).toBe('Angular 18')
  });

  it('Company Contains Correct value as `Infinite`', () => {
    expect(component.company).toBe('Infinite')    
  })

  it('Trainer Contains Correct Value as `Prasanna Pappu`', () => {
    expect(component.trainer).toBe('Prasanna Pappu')
  })
});

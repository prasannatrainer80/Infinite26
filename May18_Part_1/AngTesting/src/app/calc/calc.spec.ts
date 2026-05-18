import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Calc } from './calc';
import { FormsModule } from '@angular/forms';

describe('Calc', () => {
  let component: Calc;
  let fixture: ComponentFixture<Calc>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Calc, FormsModule]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Calc);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });


  it('Should Perform `Sum` Operation', () => {
    component.firstNo = 10
    component.secondNo = 20
    component.sum() 
    expect(component.result).toBe(30)
  })


  it('Should Perform `Sub` Operation', () => {
    component.firstNo = 10
    component.secondNo = 20
    component.sub() 
    expect(component.result).toBe(-10)
  })

  
  it('Should Perform `Mult` Operation', () => {
    component.firstNo = 10
    component.secondNo = 20
    component.mult() 
    expect(component.result).toBe(200)
  })

});

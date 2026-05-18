import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Five } from './five';

describe('Five', () => {
  let component: Five;
  let fixture: ComponentFixture<Five>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Five]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Five);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('Should Set Message of Noorey', () => {
    component.noorey() 
    expect(component.message).toBe("Hi I am Noorey...")
  })

  it('Should Set Message for Naveen', () => {
    component.naveen() 
    expect(component.message).toBe("Hi I am Naveen...")
  })

  it('Should Set Message for Bawin', () => {
    component.bawin();
    expect(component.message).toBe("Hi I am Bawin...")
  })  
});

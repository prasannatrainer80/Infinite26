import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwoWay } from './two-way';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

describe('TwoWay', () => {
  let component: TwoWay;
  let fixture: ComponentFixture<TwoWay>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TwoWay,FormsModule,CommonModule]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TwoWay);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should contain one textbox', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    const textbox = compiled.querySelectorAll('input[type="text"]');
    expect(textbox.length).toBe(1);
  });


  it('Should Update the value in the Component', () => {
   component.sname = "Naveen";
   expect(component.sname).toBe('Naveen');
  })

  it('Should Render the NgModel Value (FormsModule)',() => {
     const compiled = fixture.nativeElement as HTMLElement;

    const input = compiled.querySelector('input') as HTMLInputElement;

    input.value = 'Angular';

    input.dispatchEvent(new Event('input'));

    fixture.detectChanges();

    expect(component.sname).toBe('Angular');
  })
});

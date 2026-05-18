import { ComponentFixture, TestBed } from '@angular/core/testing';

import { First } from './first';

describe('First', () => {
  let component: First;
  let fixture: ComponentFixture<First>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [First]
    })
    .compileComponents();

    fixture = TestBed.createComponent(First);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('Should Render the Working Test', () => {
     const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('p')?.textContent)
      .toContain('first works!');
  })  

  it('Should Render the Second Paragraph Test', () => {
      const compiled = fixture.nativeElement as HTMLElement;
      const paragraphs = compiled.querySelectorAll('p');
      expect(paragraphs[1]?.textContent)
      .toContain('This is my First Component in Angular...');
  })

  it('should contain two paragraph tags', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    const paragraphs = compiled.querySelectorAll('p');
    expect(paragraphs.length).toBe(2);
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

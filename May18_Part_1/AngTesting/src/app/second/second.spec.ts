import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Second } from './second';

describe('Second', () => {
  let component: Second;
  let fixture: ComponentFixture<Second>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Second]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Second);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

   it('should render first paragraph text', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    const paragraphs = compiled.querySelectorAll('p');

    expect(paragraphs[0]?.textContent)
      .toContain('second works!');
  });

  it('should render second paragraph text', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    const paragraphs = compiled.querySelectorAll('p');

    expect(paragraphs[1]?.textContent)
      .toContain('Welcome to Angular...This is Second Component');
  });

  it('should contain two paragraph tags', () => {
    const compiled = fixture.nativeElement as HTMLElement;
    const paragraphs = compiled.querySelectorAll('p');

    expect(paragraphs.length).toBe(2);
  });

});

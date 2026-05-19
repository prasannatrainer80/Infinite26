import { ComponentFixture, TestBed } from '@angular/core/testing';
import { provideRouter } from '@angular/router';

import { Menu } from './menu';

describe('Menu Component', () => {

  let component: Menu;
  let fixture: ComponentFixture<Menu>;

  beforeEach(async () => {

    await TestBed.configureTestingModule({

      imports: [Menu],

      providers: [
        provideRouter([])
      ]

    }).compileComponents();

    fixture = TestBed.createComponent(Menu);

    component = fixture.componentInstance;

    fixture.detectChanges();

  });

  it('should create component', () => {

    expect(component).toBeTruthy();

  });

  it('should render menu works text', () => {

    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.textContent)
      .toContain('menu works!');

  });

  it('should contain five links', () => {

    const compiled = fixture.nativeElement as HTMLElement;
    const links = compiled.querySelectorAll('a');
    expect(links.length).toBe(5);

  });

  it('should contain Employ Show link', () => {

    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.textContent)
      .toContain('Employ Show');

  });

  it('should contain Employ Search link', () => {

    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.textContent)
      .toContain('Employ Search');

  });

  it('should contain Add Employ link', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Add Employ');

  });

  it('should contain Update Employ link', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Update Employ');

  });

  it('should contain Delete Employ link', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    expect(compiled.textContent)
      .toContain('Delete Employ');

  });

  it('should contain named router outlet', () => {

    const compiled = fixture.nativeElement as HTMLElement;

    const outlet =
      compiled.querySelector('router-outlet');

    expect(outlet).toBeTruthy();

  });

});
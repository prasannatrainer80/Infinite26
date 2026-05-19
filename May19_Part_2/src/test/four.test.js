import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';

import Four from '../components/four/four';

describe('Four Component Testing', () => {

    test('should display Naveen message on button click', () => {

    render(<Four />);

    const naveenButton =
      screen.getByDisplayValue('Naveen');

    fireEvent.click(naveenButton);

    expect(
      screen.getByText(/Hi I am Naveen/i)
    ).toBeInTheDocument();

  });

  test('should display Mega message on button click', () => {

    render(<Four />);

    const megaButton =
      screen.getByDisplayValue('Mega');

    fireEvent.click(megaButton);

    expect(
      screen.getByText(/Hi I am Mega/i)
    ).toBeInTheDocument();

  });

   test('should display Bawin message on button click', () => {

    render(<Four />);

    const megaButton =
      screen.getByDisplayValue('Bawin');

    fireEvent.click(megaButton);

    expect(
      screen.getByText(/Hi I am Bawin/i)
    ).toBeInTheDocument();

  });

})
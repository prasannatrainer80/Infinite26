import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';

import Five from '../components/five/five';

describe('Five Component Testing', () => {

  test('should increment count on Increment button click', () => {

    render(<Five />);

    const incrementButton =
      screen.getByDisplayValue('Increment');

    fireEvent.click(incrementButton);

    expect(
      screen.getByText(/Count is :/i)
    ).toHaveTextContent('1');

  });

  test('should decrement count on Decrement button click', () => {

    render(<Five />);

    const decrementButton =
      screen.getByDisplayValue('Decrement');

    fireEvent.click(decrementButton);

    expect(
      screen.getByText(/Count is :/i)
    ).toHaveTextContent('-1');

  });

});
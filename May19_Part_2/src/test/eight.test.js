import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';

import Eight from '../components/eight/eight';
describe('Eight Component Testing', () => {

  test('should perform addition correctly', () => {

    render(<Eight />);

    const inputs = screen.getAllByRole('spinbutton');

    // First Number
    fireEvent.change(inputs[0], {
      target: {
        name: 'firstNo',
        value: '10'
      }
    });

    // Second Number
    fireEvent.change(inputs[1], {
      target: {
        name: 'secondNo',
        value: '5'
      }
    });

    // Click Sum Button
    const sumButton =
      screen.getByDisplayValue('Sum');

    fireEvent.click(sumButton);

    // Verify Result
    expect(inputs[2]).toHaveValue(15);

  });

  test('should perform subtraction correctly', () => {

    render(<Eight />);

    const inputs = screen.getAllByRole('spinbutton');

    fireEvent.change(inputs[0], {
      target: {
        name: 'firstNo',
        value: '10'
      }
    });

    fireEvent.change(inputs[1], {
      target: {
        name: 'secondNo',
        value: '5'
      }
    });

    const subButton =
      screen.getByDisplayValue('Sub');

    fireEvent.click(subButton);

    expect(inputs[2]).toHaveValue(5);

  });

  test('should perform multiplication correctly', () => {

    render(<Eight />);

    const inputs = screen.getAllByRole('spinbutton');

    fireEvent.change(inputs[0], {
      target: {
        name: 'firstNo',
        value: '10'
      }
    });

    fireEvent.change(inputs[1], {
      target: {
        name: 'secondNo',
        value: '5'
      }
    });

    const multButton =
      screen.getByDisplayValue('Mult');

    fireEvent.click(multButton);

    expect(inputs[2]).toHaveValue(50);

  });

});
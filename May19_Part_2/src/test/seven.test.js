import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';

import Seven from '../components/seven/seven';

describe('Seven Component Testing', () => {

  test('should display full name on Show button click', () => {

    render(<Seven />);

    const inputs = screen.getAllByRole('textbox');

    // First Name
    fireEvent.change(inputs[0], {
      target: {
        name: 'firstName',
        value: 'Deva'
      }
    });

    // Last Name
    fireEvent.change(inputs[1], {
      target: {
        name: 'lastName',
        value: 'Darshan'
      }
    });

    // Click Show Button
    const showButton =
      screen.getByDisplayValue('Show');

    fireEvent.click(showButton);

    // Verify Full Name
    expect(inputs[2]).toHaveValue('Deva Darshan');

  });

});
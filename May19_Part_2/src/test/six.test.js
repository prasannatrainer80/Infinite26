import React from 'react';
import { render, screen, fireEvent } from '@testing-library/react';

import Six from '../components/six/six';

describe('Six Component Testing', () => {

  test('should update student name on input change', () => {

    render(<Six />);

    const inputElement =
      screen.getByRole('textbox');

    fireEvent.change(inputElement, {
      target: { value: 'Prasanna' }
    });

    expect(
      screen.getByText(/Student Name is :/i)
    ).toHaveTextContent('Prasanna');

  });

});
import React from 'react';
import { render, screen } from '@testing-library/react';

import First from '../components/first/first';

describe('First Component Testing', () => {

  test('should render welcome message', () => {

    render(<First />);

    const textElement =
      screen.getByText('Welcome to React My First Component...');

    expect(textElement).toBeInTheDocument();

  });

});
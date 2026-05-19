import React from 'react';
import { render, screen } from '@testing-library/react';

import App from '../src/App';

describe('App Component Testing', () => {

  test('should render First component text', () => {

    render(<App />);

    const textElement =
      screen.getByText('Welcome to React My First Component...');

    expect(textElement).toBeInTheDocument();

  });


});
import React from 'react';
import { render, screen } from '@testing-library/react';

import Second from '../components/second/second';

describe('Second Component Testing', () => {
    
    test('should render second component message', () => {

    render(<Second />);

    const textElement =
      screen.getByText('This is Second Component...');

    expect(textElement).toBeInTheDocument();

  });
})
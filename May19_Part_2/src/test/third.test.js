import React from 'react';
import { render, screen } from '@testing-library/react';
import Third from '../components/third/third';

describe("Third Component Testing",() => {

    test('Should Render Property Values ', () => {
        render(
            <Third firstName='Naveen' lastName='Nehru' company='Infinite' />
        );

         expect(
      screen.getByText(/Naveen/i)
    ).toBeInTheDocument();

    expect(
      screen.getByText(/Nehru/i)
    ).toBeInTheDocument();

    expect(
      screen.getByText(/Infinite/i)
    ).toBeInTheDocument();
    })
})
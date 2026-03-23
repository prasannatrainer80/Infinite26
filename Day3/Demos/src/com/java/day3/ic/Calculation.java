package com.java.day3.ic;

public class Calculation {
    public static void main(String[] args) {
        ICalculation calc  = new ICalculation() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }

            @Override
            public int sub(int a, int b) {
                return a-b;
            }

            @Override
            public int mult(int a, int b) {
                return a*b;
            }
        };
        System.out.println("Sum is  " + calc.sum(5,7));
        System.out.println("Sub is  " + calc.sub(5,7));
        System.out.println("Mult is  " + calc.mult(5,7));
    }
}

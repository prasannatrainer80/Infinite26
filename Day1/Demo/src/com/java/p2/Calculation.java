package com.java.p2;

import java.util.Scanner;

public class Calculation {

    public void calc(int a, int b) {
        int c = a + b;
        System.out.println("Sum is  " +c);
        c = a - b;
        System.out.println("Subtraction is  " +c);
        c = a * b;
        System.out.println("Multiplication is  " +c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two Numbers   ");
        a = sc.nextInt();
        b = sc.nextInt();
        Calculation calculation = new Calculation();
        calculation.calc(a, b);
    }
}

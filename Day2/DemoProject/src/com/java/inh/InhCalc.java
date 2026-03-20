package com.java.inh;

import java.util.Scanner;

class Input {
    int a, b;
    public void readInput() {
        System.out.println("Enter 2 Numbers   ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
    }
}

class Calculation extends Input {

    public void sum() {
        int c = a+b;
        System.out.println("Sum is  " + c);
    }

    public void sub() {
        int c = a-b;
        System.out.println("Sub is  " + c);
    }

    public void mul() {
        int c = a*b;
        System.out.println("Mul is  " + c);
    }
}
public class InhCalc {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.readInput();
        c.sum();
        c.sub();
        c.mul();
    }
}

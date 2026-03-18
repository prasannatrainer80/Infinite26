package com.java.p2;

import java.util.Scanner;

public class Demo {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int  mul(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two Numbers   ");
        a = sc.nextInt();
        b = sc.nextInt();
        Demo  demo = new Demo();
        System.out.println("Sum is  " +demo.sum(a,b));
        System.out.println("Sub is  " +demo.sub(a,b));
        System.out.println("Mul is  " +demo.mul(a,b));
    }
}

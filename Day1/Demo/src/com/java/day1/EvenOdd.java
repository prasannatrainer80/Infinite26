package com.java.day1;

import java.util.Scanner;

public class EvenOdd {

    public void check(int n) {
        if (n % 2 == 0) {
            System.out.print("Even Number...");
        } else {
            System.out.print("Odd Number...");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter Number   ");
        n = sc.nextInt();
        EvenOdd obj=new EvenOdd();
        obj.check(n);
    }
}

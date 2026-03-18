package com.java.day1;

import java.util.Scanner;

/**
 * Program to Check the given number is Positive or Negative
 */
public class PosNeg {
    public void check(int n) {
        if (n >= 0) {
            System.out.print("Positive Number...");
        } else {
            System.out.print("Negative Number...");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n = sc.nextInt();
        PosNeg pn = new PosNeg();
        pn.check(n);
    }
}

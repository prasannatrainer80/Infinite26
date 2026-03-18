package com.java.day1;

import java.util.Scanner;

/**
 * Program to Display Factors of a given number
 */
public class Factors {
    public void show(int n) {
        for(int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.println("Factor  " +i);
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        Factors f = new Factors();
        f.show(n);
    }
}

package com.java.day1;

import java.util.Scanner;

/**
 * Program to Display Factorial of Given Number
 */
public class Fact {

    public void calc(int n) {
        int i = 1;
        int f = 1;
        while (i <= n) {
            f = f * i;
            i++;
        }
        System.out.println("Factorial Value is  " +f);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N value  ");
        n = sc.nextInt();
        Fact f = new Fact();
        f.calc(n);
    }
}

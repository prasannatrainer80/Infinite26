package com.java.day1;

import java.util.Scanner;

public class PrimeEx {
    public void check(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if  (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag==true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  ");
        n = sc.nextInt();
        PrimeEx p = new PrimeEx();
        p.check(n);
    }
}

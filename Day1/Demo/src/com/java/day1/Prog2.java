package com.java.day1;

import java.util.Scanner;

/**
 * Program to define sample input from keyboard using Scanner
 */
public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Name is " +name);
    }
}

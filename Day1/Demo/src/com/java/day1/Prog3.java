package com.java.day1;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Status (true/false) ");
        flag = sc.nextBoolean();
        if (flag == true) {
            System.out.println("Student is Present...");
        } else {
            System.out.println("Student is Absent...");
        }
    }
}

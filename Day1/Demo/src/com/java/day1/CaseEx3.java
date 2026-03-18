package com.java.day1;

import java.util.Scanner;

public class CaseEx3 {

    public void check(char choice) {
        switch (choice) {
            case 'a':
            case '1' :
            case 'A':
                System.out.println("Its First Grade");
                break;
            case 'b':
            case '2':
            case 'B':
                System.out.println("Its Second Grade");
                break;
            case 'c':
            case '3':
            case 'C':
                System.out.println("Its Third Grade");
                break;
            default:
                System.out.println("Invalid Choice...");
                break;
        }
    }

    public static void main(String[] args) {
        char choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice: (Single Char Only) ");
        choice = sc.next().charAt(0);
        CaseEx3 obj = new CaseEx3();
        obj.check(choice);
    }
}

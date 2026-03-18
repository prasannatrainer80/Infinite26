package com.java.day1;

import java.util.Scanner;

public class CaseEx1 {

    public void show(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Hi I am Balu");
                break;
            case 2:
                System.out.println("Hi I am Dinesh");
                break;
            case 3 :
                System.out.println("Hi I am Naveen");
                break;
            case 4 :
                System.out.println("Hi I am Aashik");
                break;
            case 5 :
                System.out.println("Hi I am Mega");
                break;
            default :
                System.out.println("Invalid Choice...");
                break;
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice: ");
        choice = sc.nextInt();
        CaseEx1 obj = new CaseEx1();
        obj.show(choice);
    }
}

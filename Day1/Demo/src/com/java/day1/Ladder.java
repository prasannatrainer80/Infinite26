package com.java.day1;

import java.util.Scanner;

public class Ladder {
    public void show(int choice) {
        if (choice == 1) {
            System.out.println("Hi I am Aashik...");
        } else if (choice == 2) {
            System.out.println("Hi I am Balu...");
        } else if (choice == 3) {
            System.out.println("Hi I am Deva...");
        }  else if (choice == 4) {
            System.out.println("Hi I am Kaviya...");
        }  else if (choice == 5) {
            System.out.println("Hi I am Pavithra...");
        } else {
            System.out.println("Invalid Choice...");
        }
    }
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        choice = sc.nextInt();
        Ladder l = new Ladder();
        l.show(choice);
    }
}

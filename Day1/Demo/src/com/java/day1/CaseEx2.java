package com.java.day1;

import java.util.Scanner;

public class CaseEx2 {

    public void show(String dayName) {
        switch (dayName) {
            case "Monday":
                System.out.println("Its Monday");
                break;
            case "Tuesday":
                    System.out.println("Its Tuesday");
                    break;
            case "Wednesday":
                    System.out.println("Its Wednesday");
                    break;
            case "Thursday":
                    System.out.println("Its Thursday");
                    break;
            case "Friday":
                    System.out.println("Its Friday");
                    break;
            case "Saturday":
                    System.out.println("Its Saturday");
                    break;
            case "Sunday":
                    System.out.println("Its Sunday");
                    break;
            default:
                    System.out.println("Invalid Choice...");
                    break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayName;
        System.out.print("Enter the Day Name  ");
        dayName = sc.nextLine();
        CaseEx2 caseEx2 = new CaseEx2();
        caseEx2.show(dayName);
    }
}

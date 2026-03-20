package com.java.day2;

import java.util.Scanner;

enum WeekDays {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}
public class EnumEx1 {
    public static void main(String[] args) {
        WeekDays weekDays = WeekDays.FRIDAY;
        System.out.println(weekDays);
        Scanner sc = new Scanner(System.in);
        String wd;
        System.out.println("Enter WeekDay Name in Caps  ");
        wd = sc.next();
        WeekDays wk1 = WeekDays.valueOf(wd);
        System.out.println("Input Value is " +wk1);
    }
}

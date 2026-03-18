package com.java.day1;

import java.util.Scanner;

/**
 * Program to Calculate Area and Circ. of Circle
 */

public class CircleProg {
    public static void main(String[] args) {
        double radius, area, circ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radius = sc.nextDouble();
        area = Math.PI * Math.pow(radius, 2);
        circ = Math.PI * 2 * radius;
        System.out.println("Area of circle is: " + area);
        System.out.println("Circumference of circle is: " + circ);
    }
}

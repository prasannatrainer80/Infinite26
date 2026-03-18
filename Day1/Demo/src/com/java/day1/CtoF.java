package com.java.day1;

import java.util.Scanner;

/**
 * Program to Convert Celsius to Fahrenheit
 */

public class CtoF {

    public static void main(String[] args) {
        double c, f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Centigrade value   ");
        c =  sc.nextDouble();
        f = ((9 * c) / 5) + 32;
        System.out.println("Fahrenheit Value is  " +f);
    }
}

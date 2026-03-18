package com.java.day1;

public class Prog5 {
    public static void main(String[] args) {
        int x = 12;
        System.out.print(x++ + ++x);
        /*
            ACTUAL  12 + 14
            Memory  13   14
         */
    }
}

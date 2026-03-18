package com.java.day1;

public class Prog6 {
    public static void main(String[] args) {
        int x = 12;
        System.out.print(x++ + ++x + x++);
        /*
          ACTUAL   12  + 14 + 14
          MEMORY   13    14   15
         */
    }
}

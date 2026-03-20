package com.java.day2;

public class BoxExample {

    public static void main(String[] args) {
        int a=12;
        double b=12.5;
        String str="Hello";
        /* Implement Boxing in above Code */
        Object ob1 = a;
        Object ob2 = b;
        Object ob3 = str;
        /* Implement Unboxing on code */

        int a1 = (Integer)ob1;
        double b1 = (Double)ob2;
        String str1 =(String)ob3;
        System.out.println("A1  " +a1);
        System.out.println("B1  " +b1);
        System.out.println("str1  " +str1);
    }
}

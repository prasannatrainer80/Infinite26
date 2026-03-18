package com.java.day1;

public class StrMethods {
    public static void main(String[] args) {
        String str = "Welcome to Java Programming...Trainer Prasanna...";
        System.out.println("Length of String is  " +str.length());
        System.out.println("First Occurrence of Char 'e' is  " +str.indexOf("e"));
        System.out.println("Char at 5th Position    is  " +str.charAt(5));
        System.out.println("Upper Case String is  " +str.toUpperCase());
        System.out.println("Lower Case String is  " +str.toLowerCase());
        String s1 = "Deva",s2="Pavithra",s3="Deva";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s3));
        System.out.println(str.substring(5,10));
        System.out.println(str.replace("Java","Java FSD"));
    }
}

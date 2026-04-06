package com.infinite.junit;

public class RepeatExample {
  public static void main(String[] args) {
    String str = "Hi ";
    System.out.println(str.repeat(3));

    str = "Java";
    System.out.println(str.repeat(2));

    System.out.println("*".repeat(10));

    for (int i = 1; i <= 5; i++) {
      System.out.println("*".repeat(i));
    }

    str = "";
    System.out.println(str.repeat(5));

    str = "Hello";
    System.out.println(str.repeat(0));

    System.out.println("=".repeat(20));
    System.out.println("   WELCOME   ");
    System.out.println("=".repeat(20));
  }
}

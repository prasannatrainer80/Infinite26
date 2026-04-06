package com.infinite.junit;

public class StrExamples {
  public static void main(String[] args) {
    String str = "";
    System.out.println(str.isBlank());

    str = "   ";
    System.out.println(str.isBlank());

    str = " \t \n ";
    System.out.println(str.isBlank());

    str = "Java";
    System.out.println(str.isBlank());

    str = "  Hello  ";
    System.out.println(str.isBlank());

    String username = "   ";

    if (username.isBlank()) {
      System.out.println("Username cannot be empty");
    } else {
      System.out.println("Valid username");
    }
  }
}

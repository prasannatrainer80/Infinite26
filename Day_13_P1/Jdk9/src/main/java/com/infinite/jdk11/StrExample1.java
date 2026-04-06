package com.infinite.jdk11;

public class StrExample1 {
  public static void main(String[] args) {
    String str="";
    System.out.println(str.isEmpty());
    str="   ";
    System.out.println(str.isEmpty());

    str = " \t \n ";
    System.out.println(str.isBlank());
    System.out.println("* * * * * * *");
    System.out.println("- - - - - - - ");
  }
}

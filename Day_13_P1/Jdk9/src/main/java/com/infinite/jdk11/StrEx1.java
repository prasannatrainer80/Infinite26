package com.infinite.jdk11;

public class StrEx1 {
  public static void main(String[] args) {
    String names="Deva\nNaveen\nMega\nAtchaya\nBalu\nNitish\nBavya";
    System.out.println("Names Are   ");
    System.out.println("- ".repeat(6));
    names.lines().forEach(System.out::println);
    System.out.println("Total No.of Names are ");
    long count = names.lines().count();
    System.out.println("*".repeat(8));
    System.out.println(count);
    System.out.println("Names starts with Char 'N' is   ");
    System.out.println("- ".repeat(6));
    names.lines().filter(x -> x.startsWith("N")).forEach(System.out::println);
    System.out.println("Names Starts with Char 'B'  ");
    System.out.println("- ".repeat(6));
    names.lines().filter(x -> x.startsWith("B")).forEach(System.out::println);
  }
}

package com.infinite.junit;

public class StrStreams {
  public static void main(String[] args) {
    String text = "Hello\nWorld\nJava";

    text.lines().forEach(System.out::println);

     text = "One\nTwo\nThree";

    long count = text.lines().count();
    System.out.println(count);

     text = "Apple\nBanana\nAvocado";

    text.lines()
      .filter(line -> line.startsWith("A"))
      .forEach(System.out::println);

    String str = "   Java  ";
    System.out.println(str.strip());

    str = "   Java  ";
    System.out.println(str.stripLeading());

    str = "   Java  ";
    System.out.println(str.stripTrailing());

    str = "   Java  ";
    System.out.println(str.stripTrailing());

    str = "\u2003Java\u2003"; // Unicode space

    System.out.println(str.trim());   // May NOT remove properly
    System.out.println(str.strip());  // Removes correctly

    String input = "   user123   ";

    if (!input.strip().isEmpty()) {
      System.out.println("Valid Input: " + input.strip());
    }
  }
}

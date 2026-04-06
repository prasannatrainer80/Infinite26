package com.infinite.jdk11;

public class StrTestEx {
  public static void main(String[] args) {
    String str = "   Welcome      ";
    System.out.println(str.length());
    System.out.println(str);
    System.out.println("Removing Leading and Tailing Spaces ");
    System.out.println("*".repeat(5));
    System.out.println(str.strip());
    System.out.println(str.strip().length());
    System.out.println(str.length());
    System.out.println("Remove the Leading Spaces  ");
    System.out.println(str.stripLeading());
    System.out.println("Remove the Tailing Spaces  ");
    System.out.println(str.stripTrailing());

    str = "\u2003Java\u2003"; // Unicode space

    System.out.println(str.trim());   // May NOT remove properly
    System.out.println(str.strip());  // Removes correctly

  }
}

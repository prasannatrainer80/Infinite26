package com.infinite.jdk11;

import java.util.Arrays;
import java.util.List;

public class CollectionExample3 {
  public static void main(String[] args) {
    List<Employ> employList = List.of(
      new Employ(1, "Deva",84234),
      new Employ(2,"Mega",85111),
      new Employ(3,"Balu",99522)
    );

    Employ[] arrEmploy = employList.toArray(Employ[]::new);
    System.out.println("* ".repeat(10));
    Arrays.stream(arrEmploy).forEach(System.out::println);
    System.out.println("- ".repeat(10));
  }
}

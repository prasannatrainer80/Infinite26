package com.infinite.junit;

import java.util.List;

public class CollectionExample1 {
  public static void main(String[] args) {
    List<String> list = List.of("A", "B");

    String[] arr = list.toArray(String[]::new);

    for (String s : arr) {
      System.out.println(s);
    }
  }
}

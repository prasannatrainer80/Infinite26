package com.infinite.jdk11;

import java.util.Arrays;
import java.util.List;

public class CollectionExample2 {
  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Integer[] numbers = list.toArray(Integer[]::new);
    Arrays.stream(numbers).forEach(System.out::println);
  }
}

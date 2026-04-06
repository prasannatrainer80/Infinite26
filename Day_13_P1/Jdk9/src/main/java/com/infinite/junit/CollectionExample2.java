package com.infinite.junit;

import java.util.List;

public class CollectionExample2 {
  public static void main(String[] args) {
    List<Integer> list = List.of(10, 20, 30);

    Integer[] arr = list.toArray(Integer[]::new);

    for (int num : arr) {
      System.out.println(num);
    }
  }
}

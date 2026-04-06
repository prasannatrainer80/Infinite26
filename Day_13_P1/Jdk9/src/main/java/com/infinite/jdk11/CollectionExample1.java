package com.infinite.jdk11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample1 {
  public static void main(String[] args) {
    List<String> list = List.of("Naveen", "Deva","Mega","Dinesh");
    String[] names = list.toArray(String[]::new);
    Arrays.stream(names).forEach(System.out::println);
  }
}

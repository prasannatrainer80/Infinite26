package com.infinite.junit;

import java.util.List;
import java.util.stream.Collectors;

public class VarEx6 {
  public static void main(String[] args) {
    var list = List.of("Ram", "Shyam", "Hari");

    var result = list.stream()
      .filter(s -> s.startsWith("H"));

    List<String> res = result.collect(Collectors.toUnmodifiableList());
    res.forEach(System.out::println);
//    System.out.println(result.collect(Collectors.toList()));
  }
}

package com.infinite.junit;

import java.util.List;

public class VarEx3 {
  public static void main(String[] args) {
    var names = List.of("Ram", "Shyam", "Hari");

    for (var name : names) {
      System.out.println(name);
    }
  }
}

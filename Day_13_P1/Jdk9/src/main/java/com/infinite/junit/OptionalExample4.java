package com.infinite.junit;

import java.util.Optional;

public class OptionalExample4 {
  public static void main(String[] args) {
    Optional<String> name = Optional.empty();

    if (name.isEmpty()) {
      System.out.println("No value found");
    } else {
      System.out.println(name.get());
    }
  }
}

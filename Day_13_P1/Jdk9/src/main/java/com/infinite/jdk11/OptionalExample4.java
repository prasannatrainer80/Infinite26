package com.infinite.jdk11;

import java.util.Optional;

public class OptionalExample4 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Infinite");
    if (opt.isEmpty()) {
      System.out.println("No value found");
    } else {
      System.out.println(opt.get());
    }
  }
}

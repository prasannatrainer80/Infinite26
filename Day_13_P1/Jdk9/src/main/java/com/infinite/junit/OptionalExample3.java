package com.infinite.junit;

import java.util.Optional;

public class OptionalExample3 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Hello");

    System.out.println(opt.isPresent()); // true
    System.out.println(opt.isEmpty());   // false
  }
}

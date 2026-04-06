package com.infinite.junit;

import java.util.Optional;

public class OptionalExample2 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Java");

    System.out.println(opt.isEmpty());
  }
}

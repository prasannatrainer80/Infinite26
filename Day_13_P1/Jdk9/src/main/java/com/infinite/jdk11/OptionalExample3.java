package com.infinite.jdk11;

import java.util.Optional;

public class OptionalExample3 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.of("Infinite");
    System.out.println(opt.isEmpty());
    System.out.println(opt.isPresent());
  }
}

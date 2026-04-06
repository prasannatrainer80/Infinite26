package com.infinite.jdk11;

import java.util.Optional;

public class OptionalExample6 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.empty();
    String value = opt.isEmpty() ? " Default Value  " : opt.get();
    System.out.println(value);
    opt = Optional.of("Infinite  ");
    System.out.println(opt.get());
  }
}

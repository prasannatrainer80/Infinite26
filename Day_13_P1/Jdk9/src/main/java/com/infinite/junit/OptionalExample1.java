package com.infinite.junit;

import java.util.Optional;

public class OptionalExample1 {
  public static void main(String[] args) {
    Optional<String> opt = Optional.empty();

    System.out.println(opt.isEmpty());
  }
}

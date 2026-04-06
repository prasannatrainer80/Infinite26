package com.infinite.jdk11;

import java.util.Optional;

public class OptionalExample1 {
  public static void main(String[] args) {
    Optional<String> optional = Optional.empty();
    System.out.println(optional.isEmpty());
  }
}

package com.infinite.junit;

import java.util.Optional;

public class OptionalExample5 {
  public static Optional<String> findUser(String id) {
    if (id.equals("101")) {
      return Optional.of("Prasanna");
    }
    return Optional.empty();
  }

  public static void main(String[] args) {
    Optional<String> user = findUser("102");

    if (user.isEmpty()) {
      System.out.println("User not found");
    }
  }
}

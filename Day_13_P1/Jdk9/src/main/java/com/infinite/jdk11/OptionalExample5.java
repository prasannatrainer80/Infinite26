package com.infinite.jdk11;

import java.util.Optional;
import java.util.Scanner;

public class OptionalExample5 {

  public static Optional<String> findByUserId(int userId) {
    if (userId == 101) {
      return Optional.of(userId + "  Naveen Nehru");
    } else if (userId == 102) {
      return  Optional.of(userId + "  Balu");
    } else if (userId == 103) {
      return  Optional.of(userId + "  Noorey");
    } else {
      return Optional.empty();
    }
  }
  public static void main(String[] args) {
    int id;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your ID   ");
    id = sc.nextInt();
    Optional<String> result = findByUserId(id);
    if (result.isEmpty()) {
       System.out.println("User not found");
    } else {
       System.out.println(result.get());
    }
  }
}

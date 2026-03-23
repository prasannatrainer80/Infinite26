package com.java.day3.ic;

class Testing {
    void topic() {
        System.out.println("Topic is Java Fsd...");
    }
}

public class Example5 {
    public static void main(String[] args) {
        Testing testing = new Testing() {
           public void trainer() {
              System.out.println("Trainer is Prasanna...");
          }
          public void mode() {
              System.out.println("Mode is Online...");
          }
          public void company() {
              System.out.println("Company is Infinite...");
          }
        };
        testing.topic();
    }
}

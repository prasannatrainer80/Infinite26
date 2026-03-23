package com.java.day3.ic;

class Data {
    void show() {
        System.out.println("show from Outer...");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Data data = new Data() {
            @Override
          void show() {
              super.show();
              System.out.println("Anonymous Data...");
          }
        };
        data.show();
    }
}

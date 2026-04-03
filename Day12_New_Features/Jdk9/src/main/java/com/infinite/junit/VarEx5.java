package com.infinite.junit;

import java.util.HashMap;

public class VarEx5 {
  public static void main(String[] args) {
    var map = new HashMap<Integer, String>();

    map.put(1, "One");
    map.put(2, "Two");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}

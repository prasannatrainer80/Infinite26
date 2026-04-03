package com.infinite.junit;

import java.util.HashMap;

public class VarExample3 {
  public static void main(String[] args) {
    var map = new HashMap<Integer, String>();

    map.put(1, "Deva");
    map.put(2, "Mega");
    map.put(3, "Naveen");
    map.put(4, "Balu");
    map.put(5, "Aashik");

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}

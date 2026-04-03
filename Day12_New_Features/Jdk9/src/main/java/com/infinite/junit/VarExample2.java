package com.infinite.junit;

import java.util.ArrayList;

public class VarExample2 {
  public static void main(String[] args) {
    var list = new ArrayList<String>();
    list.add("Deva");
    list.add("Naveen");
    list.add("Balue");

    list.stream().forEach(System.out::println);
  }

}

package com.infinite.junit;


import java.util.stream.Stream;

public class Data {

  public int show(int[] a) {
    return a[3];
  }

  static Stream<int[]> showforcalc() {
     return Stream.of(
       new int[]{1,2,3},
       new int[]{5,5,10},
       new int[]{10,20,30}
     );
  }
  static Stream<Integer> shownumbers() {
    return Stream.of(1,2,3,4,5);
  }
  public boolean posNeg(int n) {
    if (n >= 0) {
      return true;
    }
    return false;
  }

  public int max3(int a, int b, int c) {
    int m = a;
    if (m < b) {
      m = b;
    }
    if (m < c) {
      m = c;
    }
    return m;
  }

  public int division(int a, int b) {
    return a / b;
  }
  public int fact(int n) {
    int f =1;
    for(int i=1;i<=n;i++) {
      f = f * i;
    }
    return f;
  }

  public String sayHello() {
    return "Welcome to Junit5 Programming...";
  }

  public int sum(int a, int b) {
    return a + b;
  }
}

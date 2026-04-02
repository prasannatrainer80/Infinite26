package com.infinite.junit;

public class Data {

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

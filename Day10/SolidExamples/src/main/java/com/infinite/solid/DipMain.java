package com.infinite.solid;

public class DipMain {
  public static void main(String[] args) {
    JavaBookInfo jbinfo = new JavaBookInfo(new JavaBook());
    NetworkBookInfo netbookinfo = new NetworkBookInfo(new NetworkBook());

    jbinfo.details();
    System.out.println("----------------------------");
    netbookinfo.details();
  }
}

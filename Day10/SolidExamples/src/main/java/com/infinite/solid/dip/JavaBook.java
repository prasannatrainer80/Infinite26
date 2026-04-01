package com.infinite.solid.dip;

public class JavaBook implements IBookDetails{
  @Override
  public void name() {
    System.out.println("Java 2 Complete Reference...");
  }

  @Override
  public void author() {
    System.out.println("Author is Yashwant Kanetkar...");
  }
}

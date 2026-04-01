package com.infinite.solid.dip;

public class NetworkBook implements IBookDetails {
  @Override
  public void name() {
    System.out.println("Book Name Mastering in Networks");
  }

  @Override
  public void author() {
    System.out.println("Author is Ten N Balm");
  }
}

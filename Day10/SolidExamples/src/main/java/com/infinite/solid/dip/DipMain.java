package com.infinite.solid.dip;

import java.awt.print.Book;

public class DipMain {
  public static void main(String[] args) {
    IBookDetails book1 = new JavaBook();
    IBookDetails book2 = new NetworkBook();

    BookUtil util1 = new BookUtil(book1);
    BookUtil util2 = new BookUtil(book2);

    util1.showBookInfo();
    System.out.println("-----------------");
    util2.showBookInfo();
  }
}

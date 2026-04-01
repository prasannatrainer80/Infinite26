package com.infinite.solid;

public class JavaBookInfo {

  private JavaBook javaBook;

  public JavaBookInfo(JavaBook javaBook) {
    this.javaBook = javaBook;
  }

  public void details() {
    javaBook.author();
    javaBook.bookName();
  }
}

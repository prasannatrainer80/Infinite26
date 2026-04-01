package com.infinite.solid.dip;

public class BookUtil {

  private IBookDetails iBookDetails;

  public BookUtil(IBookDetails iBookDetails) {
    this.iBookDetails = iBookDetails;
  }
  public void showBookInfo() {
    iBookDetails.author();
    iBookDetails.name();
  }
}

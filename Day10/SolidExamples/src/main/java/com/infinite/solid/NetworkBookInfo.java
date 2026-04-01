package com.infinite.solid;

public class NetworkBookInfo {

  private NetworkBook networkBook;

  public NetworkBookInfo(NetworkBook networkBook) {
    this.networkBook = networkBook;
  }

  public void details() {
    networkBook.author();
    networkBook.bookName();
  }
}

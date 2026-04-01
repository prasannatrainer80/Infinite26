package com.infinite.solid;

public class PartTimeEmploy implements IEmployDetail {
  @Override
  public void name() {
    System.out.println("Name is Prasanna...");
  }

  @Override
  public void paymentDetails() {
    System.out.println("Payment received after Tds");
  }

  @Override
  public void pfDetails() {
    throw new UnsupportedOperationException("Not supported yet.");
  }

  @Override
  public void paySlips() {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}

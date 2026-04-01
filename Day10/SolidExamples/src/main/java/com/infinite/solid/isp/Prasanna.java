package com.infinite.solid.isp;



public class Prasanna implements IEmployDetails {
  @Override
  public void name() {
    System.out.println("Name is Prasanna...");
  }

  @Override
  public void paymentDetails() {
    System.out.println("Payment after deducting TDS");
  }
}

package com.infinite.solid.isp;

public class Mega implements IEmployDetails,IAccountDetails {
  @Override
  public void pfDetails() {
    System.out.println("Pf Details are shared already");
  }

  @Override
  public void payslips() {
    System.out.println("Payslips are shared over mail");
  }

  @Override
  public void name() {
    System.out.println("Hi I am Mega");
  }

  @Override
  public void paymentDetails() {
    System.out.println("Payment through salary Account");
  }
}

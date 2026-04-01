package com.infinite.solid;

public class FullTimeEmploy implements IEmployDetail {
  @Override
  public void name() {
    System.out.println("Name is balu...");
  }

  @Override
  public void paymentDetails() {
    System.out.println("Payment through Banking Salary Account");
  }

  @Override
  public void pfDetails() {
    System.out.println("Pf details are shared");
  }

  @Override
  public void paySlips() {
    System.out.println("Payslips get mailed by 10th of every month");
  }
}

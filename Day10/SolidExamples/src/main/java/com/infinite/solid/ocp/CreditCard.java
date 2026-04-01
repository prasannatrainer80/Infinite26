package com.infinite.solid.ocp;

public class CreditCard implements IElectricity {

  @Override
  public String payment(double billAmount) {
    return "Your Bill Amount is " +billAmount + " Payment from CreditCard...";
  }
}

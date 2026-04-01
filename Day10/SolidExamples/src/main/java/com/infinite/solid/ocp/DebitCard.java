package com.infinite.solid.ocp;

public class DebitCard implements  IElectricity{
  @Override
  public String payment(double billAmount) {
    return "Your Bill Amount is " +billAmount + " Payment from DebitCard...";
  }
}

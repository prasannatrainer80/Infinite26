package com.infinite.solid.ocp;

public class SapTraining implements ITraining  {
  @Override
  public void info() {
    System.out.println("Sap Training by Vasu...");
  }

  @Override
  public void timing() {
    System.out.println("Timing is from 8 to 8");
  }
}

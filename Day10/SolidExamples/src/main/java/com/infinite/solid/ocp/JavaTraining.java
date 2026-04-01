package com.infinite.solid.ocp;

public class JavaTraining implements ITraining {
  @Override
  public void info() {
    System.out.println("Java Training Trainer is Prasanna Pappu");
  }

  @Override
  public void timing() {
    System.out.println("Timing is from 9.30 to 6.30");
  }
}

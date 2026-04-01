package com.infinite.solid.ocp;

public class DotnetTraining implements ITraining {
  @Override
  public void info() {
    System.out.println("Dotnet Training Online");
  }

  @Override
  public void timing() {
    System.out.println("Timing is from 9 to 6");
  }
}

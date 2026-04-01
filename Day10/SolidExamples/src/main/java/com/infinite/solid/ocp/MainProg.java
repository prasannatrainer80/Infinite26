package com.infinite.solid.ocp;

public class MainProg {

  public void showInfo(ITraining iTraining) {
    iTraining.info();
    iTraining.timing();
  }
  public static void main(String[] args) {
    JavaTraining jt = new JavaTraining();
    MainProg mp = new MainProg();
    mp.showInfo(jt);

    DotnetTraining dt = new  DotnetTraining();
    mp.showInfo(dt);

    SapTraining sap = new SapTraining();
    mp.showInfo(sap);
  }
}

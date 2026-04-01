package com.infinite.solid;

public class OcpMain {

  public void showInfo(Object ob) {
    if (ob instanceof  JavaTraining) {
      JavaTraining obj1 = (JavaTraining) ob;
      obj1.show();
      obj1.timing();
    }
    if (ob instanceof DotnetTraining) {
      DotnetTraining obj2 = (DotnetTraining) ob;
      obj2.show();
      obj2.timing();
    }
  }
  public static void main(String[] args) {
    JavaTraining javaTraining = new JavaTraining();
    OcpMain ocpMain = new OcpMain();
    ocpMain.showInfo(javaTraining);
  }
}

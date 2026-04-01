package com.infinite.solid;

public class JavaTrainingInfo {

  private JavaTraining javaTraining;

  public JavaTrainingInfo(JavaTraining javaTraining) {
    this.javaTraining = javaTraining;
  }

  public void details() {
    javaTraining.show();
    javaTraining.timing();
  }
}

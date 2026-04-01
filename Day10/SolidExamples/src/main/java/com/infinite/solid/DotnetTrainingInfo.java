package com.infinite.solid;

public class DotnetTrainingInfo {

  private DotnetTraining dotnetTraining;

  public DotnetTrainingInfo(DotnetTraining dotnetTraining) {
    this.dotnetTraining = dotnetTraining;
  }

  public void details() {
    dotnetTraining.show();
    dotnetTraining.timing();
  }
}

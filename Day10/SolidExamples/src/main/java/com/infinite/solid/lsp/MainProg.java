package com.infinite.solid.lsp;

public class MainProg {
  public static void main(String[] args) {
    Details[] arr = new Details[]{
      new Deva(),
      new Dhivya(),
      new Naveen()
    };
    for(Details d : arr){
      d.showInfo();
    }
  }
}

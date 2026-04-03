package com.infinite.junit;

public class SwitchCaseEx7 {

	public String show(int dayNo) {
    String result = switch(dayNo) {
      case 1 -> {
        System.out.println("Weekend");
        yield "Its Sunday...";
      }
      case 2 -> {
        System.out.println("Working Day");
        yield "Its Monday...";
      }
      default -> {
        yield "Invalid Value...";
      }
    };
    return result;
	}
	public static void main(String[] args) {
		int dayNo=2;
		String result = new SwitchCaseEx7().show(dayNo);
		System.out.println("Result is  " +result);
	}
}

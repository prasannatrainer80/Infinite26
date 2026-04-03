package com.infinite.junit;

import java.util.Scanner;

public class SwitchCaseEx6 {

  public int show(int year, int month) {
    int result = switch(month) {
      case 1,3,5,7,8,10,12 -> 31;
      case 4,6,9,11 -> 30;
      case 2 -> {
        if (year%4==0) {
          System.out.println("Its Leap Year you have 29 days...");
          yield 29;
        } else {
          System.out.println("Its Not Leap Year it has 28 Days only...");
          yield 28;
        }
      }
      default -> {
        System.out.println("Invalid Month...");
        yield 0;
      }
    };
    return result;
  }
  public static void main(String[] args) {
    int month, year;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Year and Month  ");
    year = sc.nextInt();
    month = sc.nextInt();
    SwitchCaseEx6 obj = new SwitchCaseEx6();
    System.out.println(obj.show(year,month));
  }
}

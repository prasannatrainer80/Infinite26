package com.infinite.log4;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.log4j.Logger;
public class Division {
  private static final Logger log =
    Logger.getLogger("com.java.log4.Division");
  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    log.info("Program Execution started as input 2 numbers ");

    System.out.println("Enter 2 Numbers  ");
    try {
      a = sc.nextInt();
      b = sc.nextInt();
      c = a/b;
      System.out.println("Division  " +c);
      log.info("Program ended with No Exceptions");
    } catch(ArithmeticException e) {
      log.error("Division by zero Error Occurred in the Program");
      System.err.println("Division by zero impossible...");
    } catch (InputMismatchException e) {
      log.error("String Casting Error Occurred...");
      System.err.println("String Cannot be Converted as Integer...");
    }
    catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}

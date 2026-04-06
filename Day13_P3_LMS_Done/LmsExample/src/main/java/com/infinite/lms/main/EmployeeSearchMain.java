package com.infinite.lms.main;

import com.infinite.lms.dao.EmployeeDaoImpl;
import com.infinite.lms.model.Employee;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ No  ");
    empno = sc.nextInt();
    try {
      Employee employeeFound = new EmployeeDaoImpl().searchEmployee(empno);
      if (employeeFound != null) {
        System.out.println(employeeFound);
      } else {
        System.out.println("");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

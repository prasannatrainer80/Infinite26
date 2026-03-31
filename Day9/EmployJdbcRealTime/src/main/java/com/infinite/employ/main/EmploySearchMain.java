package com.infinite.employ.main;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;
import com.infinite.employ.model.Employ;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:   ");
    empno = sc.nextInt();
    EmployDao employDao = new EmployDaoImpl();
    try {
      Employ employFound = employDao.searchEmploy(empno);
      if (employFound != null) {
        System.out.println(employFound);
      } else {
        System.out.println("Employe Not Found");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

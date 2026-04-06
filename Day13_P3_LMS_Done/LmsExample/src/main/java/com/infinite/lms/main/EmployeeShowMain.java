package com.infinite.lms.main;

import com.infinite.lms.dao.EmployeeDao;
import com.infinite.lms.dao.EmployeeDaoImpl;

import java.sql.SQLException;

public class EmployeeShowMain {
  public static void main(String[] args) {
    EmployeeDao dao = new EmployeeDaoImpl();
    try {
      dao.showEmployee().forEach(System.out::println);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

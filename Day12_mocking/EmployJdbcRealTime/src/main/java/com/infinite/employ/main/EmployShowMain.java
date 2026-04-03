package com.infinite.employ.main;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;

import java.sql.SQLException;

public class EmployShowMain {
  public static void main(String[] args) {
    EmployDao dao = new EmployDaoImpl();
    try {
      dao.showEmploy().forEach(System.out::println);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDao;
import com.infinite.hib.dao.EmployDaoImpl;

public class EmployShowMain {
  public static void main(String[] args) {
    EmployDao employDao = new EmployDaoImpl();
    employDao.showEmploy().forEach(System.out::println);
  }
}

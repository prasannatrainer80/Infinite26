package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDaoImpl;
import com.infinite.hib.model.Employ;

import java.util.List;

public class Cr3 {
  public static void main(String[] args) {
    EmployDaoImpl impl = new EmployDaoImpl();
    List<Employ> employList = impl.showByDeptAndBasic();
    employList.forEach(System.out::println);
  }
}

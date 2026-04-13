package com.infinite.spr;

public interface EmployDaoNew {
  Employ searchEmploy(int empno);
  String addEmploy(Employ employ);
  String updateEmploy(Employ employ);
  String deleteEmploy(int empno);
}

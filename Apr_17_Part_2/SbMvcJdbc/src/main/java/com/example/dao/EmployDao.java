package com.example.dao;

import com.example.model.Employ;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy();
  Employ searchEmploy(int empno);
  String addEmploy(Employ employ);
  String updateEmploy(Employ employ);
  String deleteEmploy(int empno);
}

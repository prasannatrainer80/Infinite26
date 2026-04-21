package com.example.dao;

import com.example.model.Employ;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy();
  Employ showEmploy(int empno);
  int addEmploy(Employ employ);
  void updateEmploy(Employ employ);
  void deleteEmploy(Employ employ);
}

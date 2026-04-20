package com.example.dao;

import com.example.model.Employ;
import com.example.model.Login;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy();
  Employ searchEmploy(int empno);
  String addEmploy(Employ employ);
  String updateEmploy(Employ employ);
  String deleteEmploy(int empno);
  int authentication(Login login);
}

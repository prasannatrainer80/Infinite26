package com.infinite.employ.dao;

import com.infinite.employ.model.Employ;

import java.sql.SQLException;
import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy() throws SQLException, ClassNotFoundException;
  Employ searchEmploy(int empno) throws SQLException, ClassNotFoundException;
  String addEmploy(Employ employ) throws SQLException, ClassNotFoundException;
  String updateEmploy(Employ employUpdated) throws SQLException, ClassNotFoundException;
  String deleteEmploy(int empno) throws SQLException, ClassNotFoundException;
}

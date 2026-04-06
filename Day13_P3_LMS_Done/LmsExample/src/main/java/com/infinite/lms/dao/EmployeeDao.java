package com.infinite.lms.dao;

import com.infinite.lms.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
  List<Employee> showEmployee() throws SQLException, ClassNotFoundException;
  Employee searchEmployee(int empId) throws SQLException, ClassNotFoundException;

}

package com.infinite.lms.dao;

import com.infinite.lms.model.Employee;
import com.infinite.lms.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

  Connection conn;
  PreparedStatement pstmt;

  @Override
  public List<Employee> showEmployee() throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select * from Employee";
    pstmt = conn.prepareStatement(cmd);
    ResultSet rs = pstmt.executeQuery();
    List<Employee> employees = new ArrayList<>();
    Employee emp = null;
    while(rs.next()) {
      emp = new Employee();
      emp.setEmpId(rs.getInt("EMP_ID"));
      emp.setEmpName(rs.getString("EMP_NAME"));
      emp.setEmpEmail(rs.getString("EMP_MAIL"));
      emp.setEmpDept(rs.getString("EMP_DEPT"));
      emp.setEmpMobNo(rs.getString("EMP_MOB_NO"));
      emp.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
      emp.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
      emp.setEmpManagerId(rs.getInt("EMP_MANAGER_ID"));
      employees.add(emp);
    }
    return employees;
  }

  @Override
  public Employee searchEmployee(int empId) throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select * from Employee WHERE EMP_ID = ?";
    pstmt = conn.prepareStatement(cmd);
    pstmt.setInt(1, empId);
    ResultSet rs = pstmt.executeQuery();
    Employee emp = null;
    if(rs.next()) {
      emp = new Employee();
      emp.setEmpId(rs.getInt("EMP_ID"));
      emp.setEmpName(rs.getString("EMP_NAME"));
      emp.setEmpEmail(rs.getString("EMP_MAIL"));
      emp.setEmpDept(rs.getString("EMP_DEPT"));
      emp.setEmpMobNo(rs.getString("EMP_MOB_NO"));
      emp.setEmpDtJoin(rs.getDate("EMP_DT_JOIN"));
      emp.setEmpAvailLeaveBal(rs.getInt("EMP_AVAIL_LEAVE_BAL"));
      emp.setEmpManagerId(rs.getInt("EMP_MANAGER_ID"));
    }
    return emp;
  }
}

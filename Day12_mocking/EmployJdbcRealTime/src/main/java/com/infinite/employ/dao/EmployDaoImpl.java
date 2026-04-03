package com.infinite.employ.dao;

import com.infinite.employ.model.Employ;
import com.infinite.employ.model.Gender;
import com.infinite.employ.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  Connection connection;
  PreparedStatement pst;

  @Override
  public List<Employ> showEmploy() throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "select * from Employ";
    pst = connection.prepareStatement(cmd);
    ResultSet rs = pst.executeQuery();
    List<Employ> employList = new ArrayList<Employ>();
    Employ employ = null;
    while(rs.next()) {
      employ = new Employ();
      employ.setEmpno(rs.getInt("empno"));
      employ.setName(rs.getString("name"));
      employ.setGender(Gender.valueOf(rs.getString("gender")));
      employ.setDept(rs.getString("dept"));
      employ.setDesig(rs.getString("desig"));
      employ.setBasic(rs.getDouble("basic"));
      employList.add(employ);

    }
    return employList;
  }

  @Override
  public Employ searchEmploy(int empno) throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "select * from Employ where empno = ?";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1, empno);
    ResultSet rs = pst.executeQuery();
    Employ employ = null;
    if (rs.next()) {
      employ = new Employ();
      employ.setEmpno(rs.getInt("empno"));
      employ.setName(rs.getString("name"));
      employ.setGender(Gender.valueOf(rs.getString("gender")));
      employ.setDept(rs.getString("dept"));
      employ.setDesig(rs.getString("desig"));
      employ.setBasic(rs.getDouble("basic"));
    }
    return employ;
  }

  @Override
  public String addEmploy(Employ employ) throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "Insert into Employ(empno,name,gender,dept,desig," +
      "basic) values(?,?,?,?,?,?)";
    pst = connection.prepareStatement(cmd);
    pst.setInt(1, employ.getEmpno());
    pst.setString(2, employ.getName());
    pst.setString(3, employ.getGender().toString());
    pst.setString(4, employ.getDept());
    pst.setString(5, employ.getDesig());
    pst.setDouble(6, employ.getBasic());
    pst.executeUpdate();
    return "Employ Record Inserted...";
  }

  @Override
  public String updateEmploy(Employ employUpdated) throws SQLException, ClassNotFoundException {
    Employ employFound = searchEmploy(employUpdated.getEmpno());
    if (employFound == null) {
      return "Employ Record Not Found...";
    }
    connection = ConnectionHelper.getConnection();
    String cmd = "Update Employ set Name = ?, Gender = ?, " +
      "Dept = ?, Desig = ?, Basic = ? Where Empno = ?";
    pst = connection.prepareStatement(cmd);

    pst.setString(1, employUpdated.getName());
    pst.setString(2, employUpdated.getGender().toString());
    pst.setString(3, employUpdated.getDept());
    pst.setString(4, employUpdated.getDesig());
    pst.setDouble(5, employUpdated.getBasic());
    pst.setInt(6, employUpdated.getEmpno());
    pst.executeUpdate();
    return "Employ Record Updated...";
  }

  @Override
  public String deleteEmploy(int empno) throws SQLException, ClassNotFoundException {
   Employ employFound = searchEmploy(empno);
   if (employFound == null) {
     return "Employ Record Not Found...";
   }
   String cmd = "Delete From Employ Where Empno = ?";
   connection = ConnectionHelper.getConnection();
   pst = connection.prepareStatement(cmd);
   pst.setInt(1, empno);
   pst.executeUpdate();
   return "Employ Record Deleted...";
  }
}

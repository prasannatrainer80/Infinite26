package com.example.dao;

import com.example.model.Employ;
import com.example.model.Gender;
import com.example.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class EmployDaoImpl implements EmployDao {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  @Override
  public List<Employ> showEmploy() {
    String cmd = "select * from Employ";
    List<Employ> employList = jdbcTemplate.query(cmd, new RowMapper<Employ>() {

      @Override
      public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employ employ = new Employ();
        employ.setEmpno(rs.getInt("empno"));
        employ.setName(rs.getString("name"));
        employ.setGender(Gender.valueOf(rs.getString("gender")));
        employ.setDept(rs.getString("dept"));
        employ.setDesig(rs.getString("desig"));
        employ.setBasic(rs.getDouble("basic"));
        return employ;
      }
    });
    return employList;
  }

  @Override
  public Employ searchEmploy(int empno) {
    String cmd = "select * from Employ where empno = ?";
    List<Employ> employList =
      jdbcTemplate.query(cmd, new Object[]{empno}, new RowMapper<Employ>() {
        @Override
        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
          Employ employ = new Employ();
          employ.setEmpno(rs.getInt("empno"));
          employ.setName(rs.getString("name"));
          employ.setGender(Gender.valueOf(rs.getString("gender")));
          employ.setDept(rs.getString("dept"));
          employ.setDesig(rs.getString("desig"));
          employ.setBasic(rs.getDouble("basic"));
          return employ;
        }
      });
      if (employList.size() > 0) {
        return employList.get(0);
      }
      return null;
  }

  @Override
  public String addEmploy(Employ employ) {
    String cmd = "Insert into Employ(empno,name,gender,dept," +
      "desig,basic) values(?,?,?,?,?,?)";
    jdbcTemplate.update(cmd, new Object[] {
      employ.getEmpno(), employ.getName(), employ.getGender().toString(),
      employ.getDept(), employ.getDesig(), employ.getBasic()
    });
    return "*** Employ Record Inserted ***";
  }

  @Override
  public String updateEmploy(Employ employ) {
    String cmd = "Update Employ set Name = ?, Gender = ?, " +
      "Dept = ?, Desig = ?, Basic = ? WHERE Empno = ?";
    jdbcTemplate.update(cmd, new Object[] {
      employ.getName(), employ.getGender().toString(),
      employ.getDept(), employ.getDesig(), employ.getBasic(),
      employ.getEmpno()
    });
    return "*** Employ Record Updated ***";
  }

  @Override
  public String deleteEmploy(int empno) {
    String cmd = "Delete From Employ Where Empno = ?";
    jdbcTemplate.update(cmd, new Object[]{empno});
    return "*** Employ Record Deleted ***";
  }

  @Override
  public int authentication(Login login) {
    String cmd = "select * from Login where userName = ? " +
            " AND PassCode = ?";
    List<Login> result = jdbcTemplate.query(cmd, new Object[]{login.getUserName(),login.getPassCode()}, new RowMapper<Login>() {

      @Override
      public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
        Login login = new Login();
        login.setUserName(rs.getString("userName"));
        login.setPassCode(rs.getString("passCode"));
        return login;
      };
    });
    if (result.size() > 0) {
      return 1;
    }
    return 0;
  }
}

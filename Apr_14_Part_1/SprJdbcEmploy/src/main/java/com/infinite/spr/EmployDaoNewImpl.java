package com.infinite.spr;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class EmployDaoNewImpl implements EmployDaoNew {

  private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

  public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
    this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
  }

  @Override
  public Employ searchEmploy(int empno) {
    String cmd = "select * from Employ where empno = :empno";

    Map<String, Object> map = new HashMap<>();
    map.put("empno", empno);

    Employ employFound = namedParameterJdbcTemplate.queryForObject(
      cmd,
      map,
      new RowMapper<Employ>() {
        @Override
        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
          Employ emp = new Employ();
          emp.setEmpno(rs.getInt("empno"));
          emp.setName(rs.getString("name"));
          emp.setGender(Gender.valueOf(rs.getString("gender")));
          emp.setDept(rs.getString("dept"));
          emp.setDesig(rs.getString("desig"));
          emp.setBasic(rs.getDouble("basic"));
          return emp;
        }
      }
    );

    return employFound;
  }

  @Override
  public String addEmploy(Employ employ) {
    String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) " +
      " values(:empno,:name,:gender,:dept,:desig,:basic)";
    Map<String, Object> map = new HashMap<>();
    map.put("empno", employ.getEmpno());
    map.put("name", employ.getName());
    map.put("gender", employ.getGender().toString());
    map.put("dept", employ.getDept());
    map.put("desig", employ.getDesig());
    map.put("basic", employ.getBasic());
    namedParameterJdbcTemplate.update(cmd, map);
    return "*** Employ Record Inserted ***";
  }

  @Override
  public String updateEmploy(Employ employ) {
    String cmd = "Update Employ set Name=:name,Gender=:gender," +
      "Dept=:dept,Desig=:desig,basic=:basic Where empno=:empno";
    Map<String, Object> map = new HashMap<>();
    map.put("empno", employ.getEmpno());
    map.put("name", employ.getName());
    map.put("gender", employ.getGender().toString());
    map.put("dept", employ.getDept());
    map.put("desig", employ.getDesig());
    map.put("basic", employ.getBasic());
    namedParameterJdbcTemplate.update(cmd, map);
    return "*** Employ Record Updated ***";
  }

  @Override
  public String deleteEmploy(int empno) {
    String cmd = "Delete From Employ Where empno=:empno";
    Map<String, Object> map = new HashMap<>();
    map.put("empno", empno);
    namedParameterJdbcTemplate.update(cmd,map);
    return "*** Employ Record Deleted ***";
  }
}

package com.infinite.lms.model;

import java.sql.Date;

public class Employee {
  private int empId;
  private String empName;
  private String empEmail;
  private String empMobNo;
  private Date empDtJoin;
  private String empDept;
  private int empManagerId;
  private int empAvailLeaveBal;

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getEmpEmail() {
    return empEmail;
  }

  public void setEmpEmail(String empEmail) {
    this.empEmail = empEmail;
  }

  public String getEmpMobNo() {
    return empMobNo;
  }

  public void setEmpMobNo(String empMobNo) {
    this.empMobNo = empMobNo;
  }

  public Date getEmpDtJoin() {
    return empDtJoin;
  }

  public void setEmpDtJoin(Date empDtJoin) {
    this.empDtJoin = empDtJoin;
  }

  public String getEmpDept() {
    return empDept;
  }

  public void setEmpDept(String empDept) {
    this.empDept = empDept;
  }

  public int getEmpManagerId() {
    return empManagerId;
  }

  public void setEmpManagerId(int empManagerId) {
    this.empManagerId = empManagerId;
  }

  public int getEmpAvailLeaveBal() {
    return empAvailLeaveBal;
  }

  public void setEmpAvailLeaveBal(int empAvailLeaveBal) {
    this.empAvailLeaveBal = empAvailLeaveBal;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "empId=" + empId +
      ", empName='" + empName + '\'' +
      ", empEmail='" + empEmail + '\'' +
      ", empMobNo='" + empMobNo + '\'' +
      ", empDtJoin=" + empDtJoin +
      ", empDept='" + empDept + '\'' +
      ", empManagerId=" + empManagerId +
      ", empAvailLeaveBal=" + empAvailLeaveBal +
      '}';
  }
}

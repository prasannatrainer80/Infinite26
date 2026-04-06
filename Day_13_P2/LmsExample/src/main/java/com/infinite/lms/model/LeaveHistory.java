package com.infinite.lms.model;

import java.sql.Date;

public class LeaveHistory {

  private int leaveId;
  private int empId;
  private Date leaveStartDate;
  private Date leaveEndDate;
  private int noOfDays;
  private LeaveType leaveType;
  private LeaveStatus leaveStatus;
  private String leaveReason;

  public int getLeaveId() {
    return leaveId;
  }

  public void setLeaveId(int leaveId) {
    this.leaveId = leaveId;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public Date getLeaveStartDate() {
    return leaveStartDate;
  }

  public void setLeaveStartDate(Date leaveStartDate) {
    this.leaveStartDate = leaveStartDate;
  }

  public Date getLeaveEndDate() {
    return leaveEndDate;
  }

  public void setLeaveEndDate(Date leaveEndDate) {
    this.leaveEndDate = leaveEndDate;
  }

  public int getNoOfDays() {
    return noOfDays;
  }

  public void setNoOfDays(int noOfDays) {
    this.noOfDays = noOfDays;
  }

  public LeaveType getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveType leaveType) {
    this.leaveType = leaveType;
  }

  public LeaveStatus getLeaveStatus() {
    return leaveStatus;
  }

  public void setLeaveStatus(LeaveStatus leaveStatus) {
    this.leaveStatus = leaveStatus;
  }

  public String getLeaveReason() {
    return leaveReason;
  }

  public void setLeaveReason(String leaveReason) {
    this.leaveReason = leaveReason;
  }

  @Override
  public String toString() {
    return "LeaveHistory{" +
      "leaveId=" + leaveId +
      ", empId=" + empId +
      ", leaveStartDate=" + leaveStartDate +
      ", leaveEndDate=" + leaveEndDate +
      ", noOfDays=" + noOfDays +
      ", leaveType=" + leaveType +
      ", leaveStatus=" + leaveStatus +
      ", leaveReason='" + leaveReason + '\'' +
      '}';
  }
}

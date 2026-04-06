package com.infinite.lms.dao;

import com.infinite.lms.model.Employee;
import com.infinite.lms.model.LeaveHistory;
import com.infinite.lms.model.LeaveStatus;
import com.infinite.lms.model.LeaveType;
import com.infinite.lms.util.ConnectionHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LeaveHistoryDaoImpl implements LeaveHistoryDao {

  Connection connection;
  PreparedStatement psmt;
  public static long dateDiff(Date start, Date end) {
    java.util.Date uStar =  new java.util.Date(start.getTime());
    java.util.Date uEnd = new java.util.Date(end.getTime());

    long diff = uEnd.getTime() - uStar.getTime();
    return diff / (1000 * 60 * 60 * 24);
  }
  @Override
  public String applyLeave(LeaveHistory leaveHistory) throws SQLException, ClassNotFoundException {
    Employee employeeFound = new EmployeeDaoImpl().searchEmployee(leaveHistory.getEmpId());
    int leaveBalane = employeeFound.getEmpAvailLeaveBal();
    Date d1 = new  Date(leaveHistory.getLeaveStartDate().getTime());
    Date d2 = new  Date(leaveHistory.getLeaveEndDate().getTime());
    long diff = dateDiff(leaveHistory.getLeaveStartDate(), leaveHistory.getLeaveEndDate());
    long diff1 = dateDiff(leaveHistory.getLeaveStartDate(), d1);
    long diff2 = dateDiff(leaveHistory.getLeaveEndDate(), d1);
    System.out.println(diff2);
    // long d1 = dateDiff(leaveHistory.getLeaveStartDate(), new java.sql.Date(leaveHistory.getLeaveEndDate().getTime()));
    if (diff < 0) {
      return "Leave-StartDate Cannot be Greater Than Leave End date";
    } else if (diff1 < 0) {
      return "Leave-Start Date Cannot be Yesterday Date...";
    } else if (diff2 > 0) {
      return "Leave-End Date Cannot be Yesterday Date...";
    } else if (leaveBalane - diff < 0) {
      return "Insufficient Leave Balance...";
    } else {
      diff++;
      leaveHistory.setLeaveStatus(LeaveStatus.PENDING);
        connection = ConnectionHelper.getConnection();
        String cmd = "Insert into Leave_History(Emp_ID, LEAVE_START_DATE," +
          "LEAVE_END_DATE,LEAVE_NO_OF_DAYS,LEAVE_TYPE,LEAVE_STATUS," +
          "LEAVE_REASON) VALUES(?,?,?,?,?,?,?)";
        psmt = connection.prepareStatement(cmd);
        psmt.setInt(1, leaveHistory.getEmpId());
        psmt.setDate(2, leaveHistory.getLeaveStartDate());
        psmt.setDate(3, leaveHistory.getLeaveEndDate());
        psmt.setInt(4, (int)diff);
        psmt.setString(5, leaveHistory.getLeaveType().toString());
        psmt.setString(6, leaveHistory.getLeaveStatus().toString());
        psmt.setString(7, leaveHistory.getLeaveReason());
        psmt.executeUpdate();
        cmd = "Update Employee SET EMP_AVAIL_LEAVE_BAL = " +
          "EMP_AVAIL_LEAVE_BAL - ? WHERE EMP_ID = ?";
        psmt = connection.prepareStatement(cmd);
        psmt.setInt(1, (int)diff);
        psmt.setInt(2, leaveHistory.getEmpId());
        psmt.executeUpdate();
        return "Leave Applied Successfully...";
    }

  }

  @Override
  public List<LeaveHistory> showEmployeeLeaveHistory(int empId) throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "SELECT * FROM Leave_History WHERE Emp_ID = ?";
    psmt = connection.prepareStatement(cmd);
    psmt.setInt(1, empId);
    ResultSet rs = psmt.executeQuery();
    List<LeaveHistory> leaves = new ArrayList<>();
    LeaveHistory leaveHistory = null;
    while(rs.next()) {
      leaveHistory = new LeaveHistory();
      leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
      leaveHistory.setEmpId(rs.getInt("Emp_ID"));
      leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
      leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
      leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
      leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
      leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
      leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
      leaves.add(leaveHistory);
    }
    return leaves;
  }

  @Override
  public List<LeaveHistory> pendingLeaves(int managerId) throws SQLException, ClassNotFoundException {
    String cmd = "select * from leave_history WHERE " +
      "EMP_ID = ANY(select emp_ID from employee WHERE " +
      "EMP_MANAGER_ID = ? AND LEAVE_STATUS='PENDING')";
    connection = ConnectionHelper.getConnection();
    psmt = connection.prepareStatement(cmd);
    psmt.setInt(1, managerId);
    ResultSet rs = psmt.executeQuery();
    List<LeaveHistory> leaves = new ArrayList<>();
    LeaveHistory leaveHistory = null;
    while(rs.next()) {
      leaveHistory = new LeaveHistory();
      leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
      leaveHistory.setEmpId(rs.getInt("Emp_ID"));
      leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
      leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
      leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
      leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
      leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
      leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
      leaves.add(leaveHistory);
    }
    return leaves;
  }

  @Override
  public String acceptOrRejectLeave(int leaveId, int managerId, String status) throws SQLException, ClassNotFoundException {
    LeaveHistory leaveHistory = searchByLeaveId(leaveId);
    if(leaveHistory == null) {
      return "Leave History with LeaveId Not Found";
    }
    int empId = leaveHistory.getEmpId();
    int mgr = new EmployeeDaoImpl().searchEmployee(empId).getEmpManagerId();
    if (managerId != mgr) {
      return "You are not Authorized Manager to Approve...";
    }
    if (status.toUpperCase().equals("YES")) {
      String cmd = "Update Leave_History Set LEAVE_STATUS = " +
        "'APPROVED' WHERE EMP_ID = ? and LEAVE_ID = ?";
      connection = ConnectionHelper.getConnection();
      psmt = connection.prepareStatement(cmd);
      psmt.setInt(1, leaveHistory.getEmpId());
      psmt.setInt(2, leaveHistory.getLeaveId());
      psmt.executeUpdate();
      return "Leave Approved Successfully...";
    } else {
      String cmd = "Update Leave_History Set LEAVE_STATUS = " +
        "'DENIED' WHERE EMP_ID = ? AND LEAVE_ID = ?";
      connection = ConnectionHelper.getConnection();
      psmt = connection.prepareStatement(cmd);
      psmt.setInt(1, leaveHistory.getEmpId());
      psmt.setInt(2, leaveHistory.getLeaveId());
      psmt.executeUpdate();
      cmd = "Update Employee SET EMP_AVAIL_LEAVE_BAL = " +
        " EMP_AVAIL_LEAVE_BAL + ? WHERE EMP_ID = ?";
      psmt = connection.prepareStatement(cmd);
      int leaveTaken = leaveHistory.getNoOfDays();
      psmt.setInt(1, leaveTaken);
      psmt.setInt(2, leaveHistory.getEmpId());
      psmt.executeUpdate();
      return "Leave Rejected...";
    }
  }

  @Override
  public LeaveHistory searchByLeaveId(int leaveId) throws SQLException, ClassNotFoundException {
    String cmd = "SELECT * FROM Leave_History WHERE LEAVE_ID = ?";
    connection = ConnectionHelper.getConnection();
    psmt = connection.prepareStatement(cmd);
    psmt.setInt(1, leaveId);
    ResultSet rs = psmt.executeQuery();
    LeaveHistory leaveHistory = null;
    if (rs.next()) {
      leaveHistory = new LeaveHistory();
      leaveHistory.setLeaveId(rs.getInt("LEAVE_ID"));
      leaveHistory.setEmpId(rs.getInt("Emp_ID"));
      leaveHistory.setLeaveStartDate(rs.getDate("LEAVE_START_DATE"));
      leaveHistory.setLeaveEndDate(rs.getDate("LEAVE_END_DATE"));
      leaveHistory.setLeaveType(LeaveType.valueOf(rs.getString("LEAVE_TYPE")));
      leaveHistory.setLeaveStatus(LeaveStatus.valueOf(rs.getString("LEAVE_STATUS")));
      leaveHistory.setLeaveReason(rs.getString("Leave_Reason"));
      leaveHistory.setNoOfDays(rs.getInt("LEAVE_NO_OF_DAYS"));
    }
    return leaveHistory;
  }
}

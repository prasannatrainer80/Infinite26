package com.infinite.lms.dao;

import com.infinite.lms.model.LeaveHistory;

import java.sql.SQLException;
import java.util.List;

public interface LeaveHistoryDao {
  String applyLeave(LeaveHistory leaveHistory) throws SQLException, ClassNotFoundException;
  List<LeaveHistory> showEmployeeLeaveHistory(int empId) throws SQLException, ClassNotFoundException;
  List<LeaveHistory> pendingLeaves(int managerId) throws SQLException, ClassNotFoundException;
  String acceptOrRejectLeave(int leaveId, int managerId,String status) throws SQLException, ClassNotFoundException;
  LeaveHistory searchByLeaveId(int leaveId) throws SQLException, ClassNotFoundException;
}

package com.infinite.lms.main;

import com.infinite.lms.dao.LeaveHistoryDao;
import com.infinite.lms.dao.LeaveHistoryDaoImpl;
import com.infinite.lms.model.LeaveHistory;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeLeaveHistoryMain {
  public static void main(String[] args) {
    int empId;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee ID:  ");
    empId = sc.nextInt();
    LeaveHistoryDao dao = new LeaveHistoryDaoImpl();
    try {
      List<LeaveHistory> history = dao.showEmployeeLeaveHistory(empId);
      history.forEach(System.out::println);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

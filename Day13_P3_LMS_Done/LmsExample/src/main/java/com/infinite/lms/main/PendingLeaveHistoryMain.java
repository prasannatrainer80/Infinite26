package com.infinite.lms.main;

import com.infinite.lms.dao.LeaveHistoryDao;
import com.infinite.lms.dao.LeaveHistoryDaoImpl;
import com.infinite.lms.model.LeaveHistory;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PendingLeaveHistoryMain {
  public static void main(String[] args) {
    int managerId;
    Scanner sc =  new Scanner(System.in);
    System.out.println("Enter Manager Id  ");
    managerId = sc.nextInt();
    LeaveHistoryDao leaveHistoryDao = new LeaveHistoryDaoImpl();
    try {
      List<LeaveHistory> pendingLeaves = leaveHistoryDao.pendingLeaves(managerId);
      pendingLeaves.forEach(System.out::println);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

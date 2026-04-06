package com.infinite.lms.main;

import com.infinite.lms.dao.LeaveHistoryDao;
import com.infinite.lms.dao.LeaveHistoryDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class ApproveDenyMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Leave Id  ");
    int leaveId = sc.nextInt();
    System.out.println("Enter Manager Id  ");
    int managerId = sc.nextInt();
    System.out.println("Enter Status (YES/NO)  ");
    String status = sc.next();
    LeaveHistoryDao dao = new LeaveHistoryDaoImpl();
    try {
      System.out.println(dao.acceptOrRejectLeave(leaveId,managerId,status));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

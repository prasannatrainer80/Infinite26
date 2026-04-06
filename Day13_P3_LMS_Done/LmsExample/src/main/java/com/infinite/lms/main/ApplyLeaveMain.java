package com.infinite.lms.main;

import com.infinite.lms.dao.LeaveHistoryDaoImpl;
import com.infinite.lms.model.LeaveHistory;
import com.infinite.lms.model.LeaveType;

import javax.print.SimpleDoc;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ApplyLeaveMain {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd");
    Scanner sc=new Scanner(System.in);
    LeaveHistory leaveHistory = new LeaveHistory();
    System.out.println("Enter Employee Id  ");
    leaveHistory.setEmpId(sc.nextInt());
    System.out.println("Enter Leave-Start Date (yyyy-MM-dd)  ");
    Date d1 = sdf.parse(sc.next());
    java.sql.Date sqldate = new  java.sql.Date(d1.getTime());
    leaveHistory.setLeaveStartDate(sqldate);
    System.out.println("Enter Leave-End Date (yyyy-MM-dd)  ");
    Date d2 = sdf.parse(sc.next());
    java.sql.Date sqldate2 = new  java.sql.Date(d2.getTime());
    leaveHistory.setLeaveEndDate(sqldate2);
    System.out.println("Enter Leave Type (EL/PL/ML)  ");
    leaveHistory.setLeaveType(LeaveType.valueOf(sc.next()));
    System.out.println("Enter Leave Reason  ");
    leaveHistory.setLeaveReason(sc.next());
    try {
      System.out.println(new LeaveHistoryDaoImpl().applyLeave(leaveHistory));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}

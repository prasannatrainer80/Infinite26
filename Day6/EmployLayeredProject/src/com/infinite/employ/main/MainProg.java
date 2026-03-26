package com.infinite.employ.main;

import com.infinite.employ.bal.EmployBal;
import com.infinite.employ.exception.EmployException;
import com.infinite.employ.model.Employ;
import com.infinite.employ.model.Gender;

import java.util.List;
import java.util.Scanner;

public class MainProg {

    static EmployBal employBal;
    static Scanner sc;
    static {
        employBal = new EmployBal();
        sc = new Scanner(System.in);
    }

    public static void showEmployMain() {
        List<Employ> employList = employBal.showEmployBal();
        employList.forEach(System.out::println);
    }
    public static void addEmployMain() throws EmployException {
        Employ employ = new Employ();
        System.out.println("Enter Employ No  ");
        employ.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name  ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE)  ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Department  ");
        employ.setDept(sc.next());
        System.out.println("Enter Designation  ");
        employ.setDesig(sc.next());
        System.out.println("Enter Salary  ");
        employ.setBasic(sc.nextDouble());
        System.out.println(employBal.addEmployBal(employ));
    }

    public static void updateEmployMain() throws EmployException {
        Employ employ = new Employ();
        System.out.println("Enter Employ No  ");
        employ.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name  ");
        employ.setName(sc.next());
        System.out.println("Enter Gender (MALE/FEMALE)  ");
        employ.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Department  ");
        employ.setDept(sc.next());
        System.out.println("Enter Designation  ");
        employ.setDesig(sc.next());
        System.out.println("Enter Salary  ");
        employ.setBasic(sc.nextDouble());
        System.out.println(employBal.updateEmployBal(employ));
    }

    public static void deleteEmployMain() {
        int empno;
        System.out.println("Enter Employ No  ");
        empno = sc.nextInt();
        System.out.println(employBal.deleteEmployBal(empno));
    }
    public static void searchEmployMain() {
        int empno;
        System.out.println("Enter Employ No  ");
        empno = sc.nextInt();
        Employ employFound = employBal.searchEmployBal(empno);
        if (employFound!=null) {
            System.out.println(employFound);
        } else {
            System.out.println("*** Record Not Found ***");
        }
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("O P T I O N S");
            System.out.println("--------------");
            System.out.println("1. Add Employ");
            System.out.println("2. Show Employ");
            System.out.println("3. Search Employ");
            System.out.println("4. Delete Employ");
            System.out.println("5. Update Employ");
            System.out.println("8. Exit");
            System.out.println("Enter Your Choice   ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    try {
                        addEmployMain();

                    } catch (EmployException e) {
                       System.err.println(e.getMessage());
                    }
                    break;
                case 2 :
                    showEmployMain();
                    break;
                case 3 :
                    searchEmployMain();
                    break;
                case 4 :
                    deleteEmployMain();
                    break;
                case 5 :
                    try {
                        updateEmployMain();
                    } catch (EmployException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 8 : return;
            }
        } while(choice!=8);
    }
}

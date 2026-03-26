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

    public static void showEmploy() {
        List<Employ> employList = employBal.showEmployBal();
        employList.forEach(System.out::println);
    }
    public static void addEmploy() throws EmployException {
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

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("O P T I O N S");
            System.out.println("--------------");
            System.out.println("1. Add Employ");
            System.out.println("2. Show Employ");
            System.out.println("8. Exit");
            System.out.println("Enter Your Choice   ");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    try {
                        addEmploy();

                    } catch (EmployException e) {
                       System.err.println(e.getMessage());
                    }
                    break;
                case 2 :
                    showEmploy();
                    break;
                case 8 : return;
            }
        } while(choice!=8);
    }
}

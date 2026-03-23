package com.java.day3.prop;

import java.util.Scanner;

public class EmployMainNew {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employ emp1 =  new Employ();
        System.out.println("Enter Employ Number   ");
        emp1.setEmpno(sc.nextInt());
        System.out.println("Enter Employ Name   ");
        emp1.setName(sc.next());
        System.out.println("Enter Employ Gender   ");
        emp1.setGender(Gender.valueOf(sc.next()));
        System.out.println("Enter Employ Department    ");
        emp1.setDept(sc.next());
        System.out.println("Enter Employ Designation   ");
        emp1.setDesig(sc.next());
        System.out.println("Enter Employ Salary        ");
        emp1.setBasic(sc.nextDouble());
        /* Print the Records */
        System.out.println("Employ No   " +emp1.getEmpno());
        System.out.println("Employ Name   " +emp1.getName());
        System.out.println("Employ Gender   " +emp1.getGender());
        System.out.println("Employ Dept   " +emp1.getDept());
        System.out.println("Employ Designation   " +emp1.getDesig());
        System.out.println("Employ Basic   " +emp1.getBasic());

    }
}

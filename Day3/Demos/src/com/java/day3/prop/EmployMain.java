package com.java.day3.prop;

public class EmployMain {
    public static void main(String[] args) {
        Employ emp1 =  new Employ();
        emp1.setEmpno(1);
        emp1.setName("Dinesh");
        emp1.setGender(Gender.MALE);
        emp1.setDept("Java");
        emp1.setDesig("Programmer");
        emp1.setBasic(99723.22);

        /* Print the Records */
        System.out.println("Employ No   " +emp1.getEmpno());
        System.out.println("Employ Name   " +emp1.getName());
        System.out.println("Employ Gender   " +emp1.getGender());
        System.out.println("Employ Dept   " +emp1.getDept());
        System.out.println("Employ Desig   " +emp1.getDesig());
        System.out.println("Employ Basic   " +emp1.getBasic());
    }
}

package com.java.day2;

public class EmployShow {
    public static void main(String[] args) {
        Employ emp1 = new Employ();
        emp1.empno = 1;
        emp1.name = "Naveen";
        emp1.basic = 88233.32;

        Employ emp2 = new Employ();
        emp2.empno = 3;
        emp2.name = "Atchaya";
        emp2.basic = 99111.33;

        Employ emp3 = new Employ();
        emp3.empno = 4;
        emp3.name = "Bavya";
        emp3.basic = 89124.33;

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}

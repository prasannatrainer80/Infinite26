package com.java.day3.prop;

public class Test {
    public static void main(String[] args) {
        Employ emp1 =  new Employ();
        emp1.setEmpno(1);
        emp1.setName("Dinesh");
        emp1.setGender(Gender.MALE);
        emp1.setDept("Java");
        emp1.setDesig("Programmer");
        emp1.setBasic(99723.22);

        Employ emp2 =  new Employ();
        emp2.setEmpno(1);
        emp2.setName("Dinesh");
        emp2.setGender(Gender.MALE);
        emp2.setDept("Java");
        emp2.setDesig("Programmer");
        emp2.setBasic(99723.22);

        System.out.println(emp1==emp2);
        System.out.println(emp1.equals(emp2));
    }
}

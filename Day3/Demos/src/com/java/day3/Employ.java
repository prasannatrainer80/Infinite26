package com.java.day3;

public class Employ {
    int empno;
    String name;
    double salary;

    public Employ(int empno, String name, double salary) {
        this.empno = empno;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

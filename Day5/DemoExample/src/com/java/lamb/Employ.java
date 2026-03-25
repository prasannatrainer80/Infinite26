package com.java.lamb;

import java.util.Objects;

public class Employ {

    private int empno;
    private String name;
    private double basic;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return empno == employ.empno && Double.compare(basic, employ.basic) == 0 && Objects.equals(name, employ.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, name, basic);
    }

    public Employ() { }
    public Employ(int empno, String name, double basic) {
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", basic=" + basic +
                '}';
    }
}

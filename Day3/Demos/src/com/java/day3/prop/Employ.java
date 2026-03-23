package com.java.day3.prop;

import java.util.Objects;

/**
 * Implement Read/Write Properties
 */
public class Employ {
    private int empno;
    private String name;
    private Gender gender;
    private String dept;
    private String desig;
    private double basic;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employ employ = (Employ) o;
        return empno == employ.empno && Double.compare(basic, employ.basic) == 0 && Objects.equals(name, employ.name) && gender == employ.gender && Objects.equals(dept, employ.dept) && Objects.equals(desig, employ.desig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, name, gender, dept, desig, basic);
    }
}

package com.java.day4;

public class Student {
    private int sid;
    private String sname;
    private String city;
    private double cgpa;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", city='" + city + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    public Student() {

    }
    public Student(int sid, String sname, String city, double cgpa) {
        this.sid = sid;
        this.sname = sname;
        this.city = city;
        this.cgpa = cgpa;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

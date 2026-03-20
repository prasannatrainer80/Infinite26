package com.java.day2;

public class Student {

    int sid;
    String name;
    double cgpa;
    LeaveStatus status;

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", cgpa=" + cgpa +
                ", status=" + status +
                '}';
    }
}

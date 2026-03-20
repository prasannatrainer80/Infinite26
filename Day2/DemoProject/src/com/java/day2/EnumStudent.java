package com.java.day2;

public class EnumStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.sid = 1;
        student1.name = "Kaviya";
        student1.cgpa = 9.5;
        student1.status = LeaveStatus.PENDING;

        Student student2 = new Student();
        student2.sid = 2;
        student2.name = "Naveen";
        student2.cgpa = 8.5;
        student2.status = LeaveStatus.APPROVED;

        System.out.println(student1);
        System.out.println(student2);
    }
}

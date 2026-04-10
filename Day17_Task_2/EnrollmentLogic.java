package com.example.demo;

import java.util.List;

public class EnrollmentLogic {

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void displayInfo() {
        for (Student student : students) {
            System.out.println(student);

            int diff = student.getSeatsRequested() -
                       student.getCourse().getSeatsAvailable();

            if (diff > 0) {
                System.out.println("Seats not available...");
            } else {
                double totalFee =
                        student.getSeatsRequested() *
                        student.getCourse().getFee();

                System.out.println("Total Fee: " + totalFee);
            }
        }
    }
}
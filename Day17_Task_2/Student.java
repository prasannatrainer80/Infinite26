package com.example.demo;

public class Student {

    private int studentId;
    private int seatsRequested;
    private Course course;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getSeatsRequested() {
        return seatsRequested;
    }

    public void setSeatsRequested(int seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", seatsRequested=" + seatsRequested +
                ", course=" + course + "]";
    }
}
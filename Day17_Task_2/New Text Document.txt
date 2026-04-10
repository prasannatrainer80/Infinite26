package com.example.demo;

public class Course {

    private String courseName;
    private int seatsAvailable;
    private double fee;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Course [courseName=" + courseName +
                ", seatsAvailable=" + seatsAvailable +
                ", fee=" + fee + "]";
    }
}
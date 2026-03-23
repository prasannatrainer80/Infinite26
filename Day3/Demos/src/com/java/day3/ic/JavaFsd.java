package com.java.day3.ic;

public class JavaFsd {
    public static void main(String[] args) {
        IExam obj = new IExam() {
            @Override
            public void mcqExam() {
                System.out.println("MCQ Exam to be Conducted...");
            }

            @Override
            public void practicalExam() {
                System.out.println("Practical Exam to be Conducted...");
            }

            @Override
            public void capstoneExam() {
                System.out.println("Capstone Exam to be Conducted at end...");
            }
        };
        obj.mcqExam();
        obj.practicalExam();
        obj.capstoneExam();
    }
}

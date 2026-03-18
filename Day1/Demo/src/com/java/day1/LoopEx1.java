package com.java.day1;

public class LoopEx1 {

    public void show(int count) {
        int i = 0; /* Initialization Phase */
        while (i < count) /* Condition Phase */ {
            System.out.println("Welcome to Control Structures...");
            i++; /* Increment Phase */
        }
    }
    public static void main(String[] args) {
        int count = 10;
        LoopEx1 loopEx1 = new LoopEx1();
        loopEx1.show(count);
    }
}

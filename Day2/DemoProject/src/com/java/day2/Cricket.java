package com.java.day2;

public class Cricket {

    static int score;
    public void increment(int x) {
        score+=x;
    }

    public static void main(String[] args) {
        Cricket fb = new Cricket();
        Cricket sb = new Cricket();
        Cricket ext = new Cricket();

        fb.increment(12);
        sb.increment(72);
        ext.increment(11);
        System.out.print("Total Score  " +Cricket.score);
    }
}

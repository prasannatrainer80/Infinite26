package com.java.day3;

class First {
    public void show() {
        System.out.println("Show Method from Class First...");
    }
}

class Second extends First {
    public void show() {
        super.show();
        System.out.println("Show Method from Class Second...");
    }
}
public class SupExample1 {
    public static void main(String[] args) {
        Second s = new Second();
        s.show();
    }
}

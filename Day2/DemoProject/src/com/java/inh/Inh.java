package com.java.inh;

class First {
    public void show() {
        System.out.println("Show method from Class First...");
    }
}

class Second extends First {
    public void display() {
        System.out.println("Display method from Class Second...");
    }
}
public class Inh {
    public static void main(String[] args) {
        Second s=new Second();
        s.display();
        s.show();
    }
}

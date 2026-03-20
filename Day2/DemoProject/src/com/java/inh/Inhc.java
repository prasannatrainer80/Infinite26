package com.java.inh;

class C1 {
    public C1() {
        System.out.println("Base Class Constructor...");
    }
}

class C2 extends C1 {
    public C2() {
        System.out.println("Derived Class Constructor...");
    }
}
public class Inhc {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}

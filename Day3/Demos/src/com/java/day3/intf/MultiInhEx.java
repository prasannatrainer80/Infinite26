package com.java.day3.intf;

interface IOne {
    void name();
}

interface ITwo {
    void email();
}

class Demo implements IOne, ITwo {

    @Override
    public void name() {
        System.out.println("From Demo Class");
    }

    @Override
    public void email() {
        System.out.println("Email is demo@gmail.com");
    }
}
public class MultiInhEx {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.name();
        demo.email();
    }
}

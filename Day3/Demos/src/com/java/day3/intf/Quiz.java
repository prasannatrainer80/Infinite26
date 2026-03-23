package com.java.day3.intf;

interface I1 {
    default void show(){
        System.out.println("Show Method from Interface 1...");
    }
}
interface I2 {
    default void show() {
        System.out.println("Show Method from Interface 2...");
    }
}
interface I3 {
    default void show(){
        System.out.println("Show Method from Interface 3...");
    }
}
class Test implements I1, I2, I3 {

    @Override
    public void show() {
        I1.super.show();
        I2.super.show();
        I3.super.show();
    }
}
public class Quiz {
    public static void main(String[] args) {
        Test  test = new Test();
        test.show();
    }
}

package com.java.day3.ic;

class Outer {
    private String company = "Infinite...";
    class Inner {
        void display(){
            System.out.println("Example for Inner Class...");
            System.out.println("Outer Class Variable Accessed..." +company);
        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

package com.java.lamb;

public class Greeting {
    public static void main(String[] args) {
        IGreeting obj1 = () -> System.out.println("Good Morning...");
        IGreeting obj2 = () -> System.out.println("Good Afternoon...");
        IGreeting obj3 = () -> System.out.println("Good Evening...");

        obj1.greet();
        obj2.greet();
        obj3.greet();
    }
}

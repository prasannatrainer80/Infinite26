package com.java.day3.ic;

class Test {
    private static String company = "Infinite";
    static class Demo {
        void display() {
            System.out.println("Static Variable " +company);
        }
    }
}
public class Example3 {
    public static void main(String[] args) {
        Test.Demo obj = new Test.Demo();
        obj.display();
    }
}

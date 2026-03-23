package com.java.day3.fin;

/**
 * Example as Final Method cannot be overrided
 */
class First {
    final void company() {
        System.out.println("company is Infinite...");
    }
}

class Second extends First {
//    void company() {
//        System.out.println("company is Infinite...");
//    }
}
public class FinExample2 {
}

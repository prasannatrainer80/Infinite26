package com.java.day3.ic;

import java.util.Scanner;

class OuterClass {
    void outerMethod() {
        class InnerClass {
            void innerMethod() {
                System.out.println("Inside Inner Class Inner Method");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.innerMethod();
    }
}
public class Example2 {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.outerMethod();
    }
}

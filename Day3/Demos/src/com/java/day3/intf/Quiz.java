package com.java.day3.intf;

interface I1 {
    default void show(){
        System.out.println("show from I1");
    }
}
interface I2 {
    void show();
}
interface I3 {
    void show();
}
class Test implements I1, I2, I3 {

}
public class Quiz {
}

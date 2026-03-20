package com.java.p1;

public class Demo extends Data {

    public void test() {
        Demo demo = new Demo();
        System.out.println(demo.publicStr);
        System.out.println(demo.protectedStr);
        System.out.println(demo.friendlyStr);
    }
}

package com.java.p2;

import com.java.p1.Data;

public class Testing extends Data {

    public void hello() {
        Testing d=new Testing();
        System.out.println(d.publicStr);
        System.out.println(d.protectedStr);
    }
}

package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {
//        List employs =  new ArrayList();
        ArrayList employs = new ArrayList();
        employs.add(new Employ(1,"Bawin",82344.2));
        employs.add(new Employ(2,"Pavithra",99932.44));
        employs.add(new Employ(3,"Niteesh",90023.43));
        employs.add(new Employ(4,"Noorey",90013.22));
        employs.add(new Employ(5,"Aashik",98823.22));

        System.out.println("Employees Records Are   ");
        for(Object ob : employs){
            Employ employ = (Employ) ob;
            System.out.println(employ);
        }
    }
}

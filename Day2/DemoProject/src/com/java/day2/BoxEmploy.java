package com.java.day2;

public class BoxEmploy {

    public void show(Object ob) {
//        int x = (Integer)ob;
          Employ employ = (Employ)ob;
          System.out.println("Employ No  " +employ.empno);
          System.out.println("Employ Name  " +employ.name);
          System.out.println("Employ Salary  " +employ.basic);
    }
    public static void main(String[] args) {
        Employ employ = new Employ();
        employ.empno = 1;
        employ.name = "Deva";
        employ.basic = 88234.22;
        BoxEmploy box = new BoxEmploy();
        box.show(employ);
    }
}

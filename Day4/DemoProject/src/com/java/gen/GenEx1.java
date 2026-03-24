package com.java.gen;

class Data<T> {
    public void swap(T a, T b) {
        T temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b + " ");
    }
}

public class GenEx1 {
    public static void main(String[] args) {
        Data d = new Data();
        int a=5,b=7;
        d.swap(a,b);
        double a1=12.5, b1=8.2;
        d.swap(a1,b1);
        String s1="Dinesh",s2="Deva";
        d.swap(s1,s2);
        boolean f1=true,f2=false;
        d.swap(f1,f2);
        Employ emp1 = new Employ(1,"Dhivya",88424.22);
        Employ emp2 = new Employ(2,"Pavithra",99924.44);
        d.swap(emp1,emp2);
    }
}

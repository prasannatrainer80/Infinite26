package com.java.day2;

public class BoxTest {

    public void show(Object ob) {
        String type = ob.getClass().getSimpleName();
        System.out.println(type);
        if (type.equals("Integer")) {
            int x = (Integer)ob;
            System.out.println("Integer Casting " +x);
        }
        if (type.equals("String")) {
            String s = (String)ob;
            System.out.println("String Casting " +s);
        }
        if (type.equals("Double")) {
            double x = (Double)ob;
            System.out.println("Double Casting " +x);
        }
    }
    public static void main(String[] args) {
        int a = 12;
        double b=12.5;
        String str="Hello";
        BoxTest test = new BoxTest();
        test.show(a);
        test.show(b);
        test.show(str);
    }
}

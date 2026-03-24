package com.java.gen;

public class VarArgs {

    public static void show(String...students) {
        for(String student : students) {
            System.out.print(student + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        show();
        show("Naveen","Dinesh");
        show("Naveen","Dinesh","Pavithra");
        show("Naveen","Dinesh","Pavithra","Deva","Dhivya","Mega");
    }
}

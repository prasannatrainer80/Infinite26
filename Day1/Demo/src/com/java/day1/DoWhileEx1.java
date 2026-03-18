package com.java.day1;

import java.util.Scanner;

public class DoWhileEx1 {
    public void show() {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            String sname;
            System.out.println("Enter Your Name  ");
            sname = sc.next();
            System.out.println("Enter Your Choice(Y/N) ");
            choice = sc.next().charAt(0);
        } while(choice=='Y' || choice=='y');
    }
    public static void main(String[] args) {
        DoWhileEx1 obj = new DoWhileEx1();
        obj.show();
    }
}

package com.java.day4;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapExample2 {
    public static void main(String[] args) {
        Map users = new Hashtable();
        users.put("Naveen","Nehru");
        users.put("Dinesh","Ramesh");
        users.put("Dhivya","Sundhar");
        users.put("Pavithra","Palsamy");
        String user, pwd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter UserName and Password  ");
        user = input.next();
        pwd = input.next();
        String res = (String) users.getOrDefault(user,"Not Found...");
        if (pwd.equals(res)) {
            System.out.println("Correct Credentials...");
        } else {
            System.out.println("Invalid Credentials...");
        }
    }
}

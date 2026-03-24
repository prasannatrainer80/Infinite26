package com.java.gen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthEx {
    public static void main(String[] args) {
        Map<String,String> users = new HashMap<>();
        users.put("Dinesh","Ramesh");
        users.put("Dhivya","Sundhar");
        users.put("Pavithra","Palsamy");
        users.put("Deva","Jagadeesh");
        String user,pwd;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter UserName : ");
        user = input.next();
        System.out.print("Enter Password : ");
        pwd = input.next();
        String res = users.getOrDefault(user,"Not Found");
        if (pwd.equals(res)){
            System.out.println("Correct Credentials...");
        } else {
            System.out.println("Incorrect Credentials...");
        }
    }
}

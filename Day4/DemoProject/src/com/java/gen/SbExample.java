package com.java.gen;

import java.util.Scanner;

public class SbExample {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("Welcome to Java FSD Programming...");
        System.out.println(sb);
        sb.insert(5,"Dinesh");
        System.out.println(sb);
        sb.delete(0,5);
        System.out.println(sb);
        sb.append("\n Testing Demo...");
        System.out.println(sb);
    }
}

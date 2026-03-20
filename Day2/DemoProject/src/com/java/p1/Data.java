package com.java.p1;

public class Data {
    private String privateStr="Welcome";
    public String publicStr="Java";
    protected String protectedStr="Hello";
    String friendlyStr="Friend";

    public void show() {
        System.out.println("Private Str: " + privateStr);
        System.out.println("Public Str: " + publicStr);
        System.out.println("Protected Str: " + protectedStr);
        System.out.println("Friendly Str: " + friendlyStr);
    }
}

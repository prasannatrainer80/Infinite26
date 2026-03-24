package com.java.ex;

import java.util.InputMismatchException;

public class ArrayEx {
    public static void main(String[] args) {
        int[] a = new int[]{12,5};
        try {
            a[10]=12;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Array Size is Small...");
        } catch (Exception e) {
           System.err.println(e);
        }

    }
}

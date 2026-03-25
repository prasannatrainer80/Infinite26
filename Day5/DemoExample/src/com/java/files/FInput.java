package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream(
                    "D:/infinite/Day5/DemoExample/src/com/java/ex/Calculation.java"
            );
            int ch;
            while((ch=fin.read()) != -1) {
                System.out.print((char)ch);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

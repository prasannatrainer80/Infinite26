package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream src = new FileInputStream("D:/infinite/Day5/DemoExample/src/com/java/ex/Calculation.java");
            FileOutputStream tar = new FileOutputStream("c:/files/Infinite.java");
            int ch;
            while((ch=src.read()) != -1) {
                tar.write(ch);
            }
            src.close();
            tar.close();
            System.out.println("*** File Copied Successfully ***");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

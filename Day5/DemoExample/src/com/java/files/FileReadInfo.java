package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadInfo {
    public static void main(String[] args) {
        File obj =
                new File("D:/infinite/Day5/DemoExample/src/com/java/ex/Calculation.java");
        try {
            FileReader fr = new FileReader(obj);
            int ch;
            while((ch= fr.read()) != -1) {
                System.out.print((char)ch);
            }
            fr.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

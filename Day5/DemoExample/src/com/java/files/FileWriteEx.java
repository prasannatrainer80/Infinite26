package com.java.files;

import java.io.*;

public class FileWriteEx {
    public static void main(String[] args) {
        File src =
                new File("D:/infinite/Day5/DemoExample/src/com/java/ex/Calculation.java");
        File tar = new File("c:/files/target.java");
        try {
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(tar);
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied Successfully...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

package com.java.files;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File obj =
                new File("D:/infinite/Day5/DemoExample/src/com/java/ex/Calculation.java");
        System.out.println("File Name  " +obj.getName());
        System.out.println("File Path  " +obj.getPath());
        System.out.println("File  Size  " +obj.length());
        System.out.println("File LastModified  " +obj.lastModified());
        System.out.println("File Parent Directory  " +obj.getParent());
    }
}

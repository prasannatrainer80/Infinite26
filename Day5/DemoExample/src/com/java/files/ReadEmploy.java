package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadEmploy {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("c:/files/emp.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            Employ employ = (Employ) oin.readObject();
            System.out.println(employ);
            oin.close();
            fin.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjInEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("c:/files/output.txt");
            ObjectInputStream objin = new ObjectInputStream(fin);
            String str = (String)objin.readObject();
            Date date = (Date)objin.readObject();
            System.out.println(str + date);
            objin.close();
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

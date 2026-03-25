package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
    public static void main(String[] args) {
        try {
            FileInputStream fin =
                    new FileInputStream("c:/files/data.txt");
            DataInputStream din = new  DataInputStream(fin);
            System.out.println(din.readInt());
            System.out.println(din.readUTF());
            System.out.println(din.readDouble());
            System.out.println(din.readBoolean());
            System.out.println(din.readChar());
            fin.close();
            din.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

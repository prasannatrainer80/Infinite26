package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("c:/files/emp.txt");
            ObjectOutputStream oout = new ObjectOutputStream(fout);
            Employ employ = new Employ(1,"Deva",92355.22);
            oout.writeObject(employ);
            oout.close();
            fout.close();
            System.out.println("Employ Object Stored in File");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

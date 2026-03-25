package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjOutEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                    new FileOutputStream("c:/files/output.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            objout.writeObject(new String("Date is :  "));
            objout.writeObject(new Date());
            objout.close();
            fout.close();
            System.out.println("Objects Stored in the File");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.java.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {
    public static void main(String[] args) {
        try {
            FileOutputStream fout =
                    new FileOutputStream("c:/files/data.txt");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(12);
            dout.writeUTF("Prasanna");
            dout.writeDouble(88423.44);
            dout.writeBoolean(true);
            dout.writeChar('a');
            dout.close();
            fout.close();
            System.out.println("Primitive Types Stored in File");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

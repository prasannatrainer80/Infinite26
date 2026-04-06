package com.infinite.junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample6 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/demo.txt");

    // Write
    Files.writeString(path, "Java 11 File Handling");

    // Read
    String data = Files.readString(path);

    System.out.println("File Content: " + data);
  }
}

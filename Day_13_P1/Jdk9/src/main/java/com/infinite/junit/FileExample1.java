package com.infinite.junit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileExample1 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/sample.txt");

    Files.writeString(path, "Hello Java 11");

    System.out.println("File written successfully");
  }
}

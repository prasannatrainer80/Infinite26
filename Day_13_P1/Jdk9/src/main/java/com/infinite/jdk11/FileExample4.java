package com.infinite.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample4 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/sample11.txt");

    String content = Files.readString(path);

    System.out.println(content);
  }
}

package com.infinite.junit;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample4 {
  public static void main(String[] args) throws Exception {
    Path path = Path.of("c:/files/sample.txt");

    String content = Files.readString(path);

    System.out.println(content);
  }
}

package com.infinite.junit;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FileExample2 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/multi.txt");

    String data = "Line 1\nLine 2\nLine 3";

    Files.writeString(path, data);
  }
}

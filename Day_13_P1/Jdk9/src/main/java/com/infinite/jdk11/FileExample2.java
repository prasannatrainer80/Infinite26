package com.infinite.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample2 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/multi.txt");

    String data = "Noorey\nDinesh\nPavithra\nBhavya";

    Files.writeString(path, data);
  }
}

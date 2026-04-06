package com.infinite.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileExample3 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/sample11.txt");

    Files.writeString(path, "\nAppended Text Thank U", StandardOpenOption.APPEND);
  }
}

package com.infinite.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileExample1 {
  public static void main(String[] args) throws IOException {
    Path path = Path.of("c:/files/sample11.txt");
    Files.writeString(path,"Welcome to Core Java 11 Features");
    System.out.println("File Sample11.txt Created Successfully...");
  }
}

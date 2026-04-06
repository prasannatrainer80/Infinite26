package com.infinite.junit;
import java.util.*;

class Student {
  int id;
  Student(int id) { this.id = id; }
}

public class CollectionExample3 {
  public static void main(String[] args) {
    List<Student> list = List.of(new Student(1), new Student(2));

    Student[] arr = list.toArray(Student[]::new);

    System.out.println(arr.length); // 2
  }
}

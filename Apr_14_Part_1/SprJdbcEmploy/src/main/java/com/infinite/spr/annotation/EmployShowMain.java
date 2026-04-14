package com.infinite.spr.annotation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployShowMain {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfig.class);

    EmployDaoImpl dao = context.getBean(EmployDaoImpl.class);

   dao.showEmploy().forEach(System.out::println);

    context.close();
  }
}

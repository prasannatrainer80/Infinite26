package com.infinite.spr;

public class HelloImpl implements Hello {

  public String getGreeting() {
    return greeting;
  }

  public void setGreeting(String greeting) {
    this.greeting = greeting;
  }

  private String greeting;


  @Override
  public String sayHello(String name) {
    return greeting + name;
  }
}

package com.infinite.spr;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProtoTypeExample {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProtoTypeExample() {

  }

  public ProtoTypeExample(String name) {
    this.name = name;
  }


}

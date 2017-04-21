package com.github.sir4ur0n.example;

import lombok.Data;

@Data
public class Example {

  private String msg;

  public void whatever() {
    System.out.println("ok");
  }

}

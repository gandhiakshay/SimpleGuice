package com.simple.guice.annotation.binding;

public class TestCricket implements Cricket {

  @Override
  public void play() {
    System.out.println("Playing 5 Days");
  }
}

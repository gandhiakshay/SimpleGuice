package com.simple.guice.annotation.binding;

public class OneDayCricket implements Cricket {

  @Override
  public void play() {
    System.out.println("Playing 50 Over match");
  }
}

package com.simple.guice.provider.binding;

public class FrenchGreeter implements Greeter {

  @Override
  public String greet() {
    return "French";
  }
}

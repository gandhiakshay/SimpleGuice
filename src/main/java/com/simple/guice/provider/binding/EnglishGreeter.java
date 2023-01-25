package com.simple.guice.provider.binding;

public class EnglishGreeter implements Greeter {

  @Override
  public String greet() {
    return "English";
  }
}

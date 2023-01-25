package com.simple.guice.linked.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new AnimalModule());
    injector.getInstance(AnimalService.class).doAction();
  }
}

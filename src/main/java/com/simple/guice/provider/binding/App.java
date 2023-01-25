package com.simple.guice.provider.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

  public static void main(String[] args) {

    TranslatorProvider provider = new TranslatorProvider();
    provider.lang("sp");
    Injector injector = Guice.createInjector(new TranslatorModule(provider));
    injector.getInstance(TranslatorService.class).translate();
  }
}

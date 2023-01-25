package com.simple.guice.provider.binding;

import java.util.Set;

import com.google.inject.Inject;

public class TranslatorService {

  @Inject private Set<Greeter> greeter;

  public void translate() {
    for (Greeter greeter : greeter) {
      System.out.println(greeter.greet());
    }
  }
}

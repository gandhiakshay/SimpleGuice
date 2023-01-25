package com.simple.guice.provider.binding;

import com.google.inject.Provider;

public class TranslatorProvider implements Provider<Greeter> {

  private String key;

  public void lang(String key) {
    this.key = key;
  }

  @Override
  public Greeter get() {

    if (key.equals("en")) {
      return new EnglishGreeter();

    } else if (key.equals("fr")) {
      return new FrenchGreeter();

    } else if (key.equals("sp")) {
      return new SpanishGreeter();
    }
    return null;
  }
}

package com.simple.guice.provider.binding;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

public class TranslatorModule extends AbstractModule {

  private TranslatorProvider provider;

  public TranslatorModule(TranslatorProvider provider) {
    this.provider = provider;
  }

  @Override
  protected void configure() {
    Multibinder<Greeter> mb = Multibinder.newSetBinder(binder(), Greeter.class);
    mb.addBinding().to(EnglishGreeter.class);
    mb.addBinding().toProvider(provider);
  }
}

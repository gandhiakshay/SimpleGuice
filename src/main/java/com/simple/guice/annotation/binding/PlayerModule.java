package com.simple.guice.annotation.binding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class PlayerModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Cricket.class).annotatedWith(Names.named("T20")).to(T20Cricket.class);
    bind(Cricket.class).annotatedWith(Names.named("Test")).to(TestCricket.class);
    bind(Cricket.class).annotatedWith(Names.named("OneDay")).to(OneDayCricket.class);
  }
}

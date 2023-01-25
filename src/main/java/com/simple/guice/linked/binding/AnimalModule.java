package com.simple.guice.linked.binding;

import com.google.inject.AbstractModule;

public class AnimalModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Animal.class).to(RealAnimal.class);
    bind(RealAnimal.class).to(RealCat.class);
  }
}

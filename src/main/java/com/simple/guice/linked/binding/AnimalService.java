package com.simple.guice.linked.binding;

import com.google.inject.Inject;

public class AnimalService {

  @Inject private RealAnimal realAnimal;

  public void doAction() {
    realAnimal.display();
    realAnimal.eat();
  }
}

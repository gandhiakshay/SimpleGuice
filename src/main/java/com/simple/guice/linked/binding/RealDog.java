package com.simple.guice.linked.binding;

public class RealDog implements RealAnimal {

  @Override
  public void display() {
    System.out.println("Display the real Animal Dog");
  }

  @Override
  public void eat() {
    System.out.println("Dog is Eating");
  }
}

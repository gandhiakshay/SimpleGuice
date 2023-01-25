package com.simple.guice.linked.binding;

public class RealCat implements RealAnimal {

  @Override
  public void display() {
    System.out.println("Display the cat");
  }

  @Override
  public void eat() {
    System.out.println("Cat is Eating");
  }
}

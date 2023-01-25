package com.simple.guice.annotation.binding;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class PlayerImpl implements Player {

  @Inject
  @Named("T20")
  private Cricket cricket;

  @Override
  public void play() {
    cricket.play();
  }
}

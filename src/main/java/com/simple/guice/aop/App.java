package com.simple.guice.aop;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class App {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BankModule());
    ServiceAdaptor adapter = injector.getInstance(ServiceAdaptor.class);
    adapter.doAction();
    //		BankService service = injector.getInstance(Key.get(BankService.class,
    // Names.named("service")));
    //		System.err.println(service.Withdraw());
  }
}

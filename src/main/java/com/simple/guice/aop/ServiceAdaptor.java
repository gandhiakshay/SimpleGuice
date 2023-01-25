package com.simple.guice.aop;

import com.google.inject.Inject;

public class ServiceAdaptor {

  @Inject private BankService bankService;

  public void doAction() {
    System.out.println("Current Balance : " + bankService.curBalance());
    System.out.println(bankService.Withdraw());
  }
}

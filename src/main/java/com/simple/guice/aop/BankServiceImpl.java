package com.simple.guice.aop;

public class BankServiceImpl implements BankService {

  @Override
  @AmountRequired
  public String Withdraw() {
    System.out.println("Transfering Successfully");
    return "Thank You !!!";
  }

  @Override
  public double curBalance() {
    Checker checker = new Checker();
    return checker.getAmountFromDB();
  }
}

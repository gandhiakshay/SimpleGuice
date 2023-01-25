package com.simple.guice.aop;

public class Checker {

  public boolean checkAmount(double amount) {
    double amountFromDB = getAmountFromDB();
    if (amountFromDB != 0 && amount != 0 && amount < amountFromDB) {
      return true;
    } else return false;
  }

  public double getAmountFromDB() {
    return 50000;
  }
}

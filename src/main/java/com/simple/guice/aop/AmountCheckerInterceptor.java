package com.simple.guice.aop;

import java.util.Scanner;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.Inject;

public class AmountCheckerInterceptor implements MethodInterceptor {

  @Inject private Checker checker;
  private Scanner scanner;

  @Override
  public Object invoke(MethodInvocation invocation) throws Throwable {
    System.out.println("Enter the Transfer Amount-->");
    scanner = new Scanner(System.in);
    double amt = scanner.nextDouble();

    if (!checker.checkAmount(amt)) {
      throw new IllegalStateException("Not enough balance available in your Account");
    }
    for (int i = 1; i <= 30; i++) {
      System.err.print(".");
      Thread.sleep(100);
    }
    System.out.println();
    System.out.println("Your current balance : " + (checker.getAmountFromDB() - amt));
    return invocation.proceed();
  }
}

package com.simple.guice.aop;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

public class BankModule extends AbstractModule {

  @Override
  protected void configure() {
    AmountCheckerInterceptor ac = new AmountCheckerInterceptor();
    requestInjection(ac);
    bindInterceptor(Matchers.any(), Matchers.annotatedWith(AmountRequired.class), ac);
    bind(BankService.class).to(BankServiceImpl.class);
  }

  //	@Provides
  //	@Named("service")
  //	public BankService provideService() {
  //		return new BankServiceImpl();
  //	}
}

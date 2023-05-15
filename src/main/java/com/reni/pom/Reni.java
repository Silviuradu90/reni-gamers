package com.reni.pom;

import com.reni.pom.pages.LoginPage;
import org.springframework.stereotype.Component;

@Component
public class Reni {

  private final LoginPage loginPage = new LoginPage();

  public LoginPage getLoginPage(){

    return loginPage.initOnDemand();
  }

}

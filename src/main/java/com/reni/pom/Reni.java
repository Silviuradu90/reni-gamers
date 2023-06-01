package com.reni.pom;

import com.reni.pom.components.LeftSideBar;
import com.reni.pom.components.TopBar;
import com.reni.pom.pages.DashboardPage;
import com.reni.pom.pages.LoginPage;
import org.springframework.stereotype.Component;

@Component
public class Reni {

  private final LoginPage loginPage = new LoginPage();
  private final DashboardPage dashboardPage = new DashboardPage();
  private final TopBar topBar = new TopBar();
  private final LeftSideBar leftSideBar = new LeftSideBar();

  public LoginPage getLoginPage() {

    return loginPage.initOnDemand();

  }

  public TopBar getTopBar() {
    return topBar.initOnDemand();
  }

  public LeftSideBar getLeftSideBar() {
    return leftSideBar.initOnDemand();
  }

  public DashboardPage dashboardPage() {

    return dashboardPage.initOnDemand();
  }


}

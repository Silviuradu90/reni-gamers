package com.reni.pom;

import com.reni.pom.components.LeftSideBar;
import com.reni.pom.components.TopBar;
import com.reni.pom.pages.DashboardPage;
import com.reni.pom.pages.LoginPage;
import com.reni.pom.pages.NewUsersPage;
import com.reni.pom.pages.UsersPage;
import org.springframework.stereotype.Component;

@Component
public class Reni {

  private final LoginPage loginPage = new LoginPage();
  private final UsersPage usersPage = new UsersPage();
  private final DashboardPage dashboardPage = new DashboardPage();
  private final TopBar topBar = new TopBar();
  private final LeftSideBar leftSideBar = new LeftSideBar();

  private final NewUsersPage newUsersPage = new NewUsersPage();

  public LoginPage getLoginPage() {
    return loginPage.initOnDemand();
  }

  public TopBar getTopBar() {
    return topBar.initOnDemand();
  }

  public UsersPage getUsersPage() {

    return usersPage.initOnDemand();
  }

  public LeftSideBar getLeftSideBar() {
    return leftSideBar.initOnDemand();
  }

  public DashboardPage dashboardPage() {
    return dashboardPage.initOnDemand();
  }

  public NewUsersPage newUsersPage(){
    return newUsersPage.initOnDemand();
  }


}

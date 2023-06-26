package com.reni.steps;
import com.reni.core.exceptions.ReniExceptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LeftSideBarSteps extends BaseStep {

  @Then("the field {string} in dashboard page is present")
  public void theFieldInDashboardPageIsPresent(String field) {
    switch (field.toUpperCase()) {
      case "MAIN" -> Assert.assertTrue(rf.getLeftSideBar().isMainDisplayed());
      case "DASHBOARD" -> Assert.assertTrue(rf.getLeftSideBar().isDashbaordDisplayed());
      case "LISTS" -> Assert.assertTrue(rf.getLeftSideBar().isListsdDisplayed());
      case "USERS" -> Assert.assertTrue(rf.getLeftSideBar().isUsersDisplayed());
      case "PRODUCTS" -> Assert.assertTrue(rf.getLeftSideBar().isProductsDisplayed());
      case "PROGRESSION" -> Assert.assertTrue(rf.getLeftSideBar().isProgressionDisplayed());
      case "CALENDARTIME" -> Assert.assertTrue(rf.getLeftSideBar().isCalendarTimeDisplayed());
      case "CONTROLPANEL" -> Assert.assertTrue(rf.getLeftSideBar().isControlPanelDisplayed());
      case "SETTINGS" -> Assert.assertTrue(rf.getLeftSideBar().isSettingsDisplayed());
      case "API" -> Assert.assertTrue(rf.getLeftSideBar().isAPIDisplayed());
      case "SYSTEMMONITOR" -> Assert.assertTrue(rf.getLeftSideBar().isSystemMonitorDisplayed());
      case "LOGS" -> Assert.assertTrue(rf.getLeftSideBar().isLogsDisplayed());
      case "USER" -> Assert.assertTrue(rf.getLeftSideBar().isUserDisplayed());
      case "LEFTPROFILE" -> Assert.assertTrue(rf.getLeftSideBar().isLeftProfileDisplayed());
      case "LOGOUT" -> Assert.assertTrue(rf.getLeftSideBar().isLogOutDisplayed());
      case "WHITETHEME" -> Assert.assertTrue(rf.getLeftSideBar().isWhiteThemDisplayed());
      case "BLACKTHEME" -> Assert.assertTrue(rf.getLeftSideBar().isWBlackThemeDisplayed());

    }
  }


  @And("the field {string} in dashboard page is present with upper case")
  public void theFieldInDashboardPageIsPresentWithUpperCase(String field) {
    switch (field.toUpperCase()) {
      case "MAIN" -> Assert.assertEquals(rf.getLeftSideBar().getMainText(), "MAIN");
      case "LISTS" -> Assert.assertEquals(rf.getLeftSideBar().getListsText(), "LISTS");
      case "CONTROL PANEL" -> Assert.assertEquals(rf.getLeftSideBar().getControlPanelText(), "CONTROL PANEL");
      case "USER" -> Assert.assertEquals(rf.getLeftSideBar().getUserText(), "USER");

    }
  }

//    System.out.println(rf.getLeftSideBar().getDashboardText());

  @And("the field {string} in dashboard page is present with one upper case")
  public void theFieldInDashboardPageIsPresentWithOneUpperCase(String field) {
    switch (field.toUpperCase()) {
      case "DASHBOARD" -> Assert.assertEquals(rf.getLeftSideBar().getDashboardText(), "Dashboard");
      case "USERS" -> Assert.assertEquals(rf.getLeftSideBar().getUsersText(), "Users");
      case "PRODUCTS" -> Assert.assertEquals(rf.getLeftSideBar().getProductsText(), "Products");
      case "PROGRESSION" -> Assert.assertEquals(rf.getLeftSideBar().getProgressionText(), "Progression");
      case "CALENDARTIME" -> Assert.assertEquals(rf.getLeftSideBar().getCalendar_TimeText(), "Calendar & Time");
      case "SETTINGS" -> Assert.assertEquals(rf.getLeftSideBar().getSettingsText(), "Settings");

      case "API" -> Assert.assertEquals(rf.getLeftSideBar().getAPIText(), "Api");

      case "SYSTEMMONITOR" -> Assert.assertEquals(rf.getLeftSideBar().getSystemMonitorText(), "System Monitor");
      case "LOGS" -> Assert.assertEquals(rf.getLeftSideBar().getLogsText(), "Logs");
      case "PROFILE" -> Assert.assertEquals(rf.getLeftSideBar().getProfileText(), "Profile");
      case "LOGOUT" -> Assert.assertEquals(rf.getLeftSideBar().getLogOutText(), "Log Out");
      default -> throw new ReniExceptions("Nu exista acel text");

    }

  }


}



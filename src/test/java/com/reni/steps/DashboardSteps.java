package com.reni.steps;


import com.reni.core.exceptions.ReniExceptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DashboardSteps extends BaseStep {

  @Given("I visit {string}")
  public void iVisit(String arg0) {
    driver.navigate().to("http://localhost:3000/dashboard");
  }

  @Then("the area {string} is present")
  public void theAreaIsPresent(String area) {

    switch (area.toUpperCase()) {
      case "USERS" -> Assert.assertTrue(rf.dashboardPage().isUssersDisplayed());
      case "PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isProductsDisplayed());
      case "BUDGET" -> Assert.assertTrue(rf.dashboardPage().isBudgetDisplayed());
      case "HAPPYNESS" -> Assert.assertTrue(rf.dashboardPage().isHappynessDisplayed());
      case "ENERGY" -> Assert.assertTrue(rf.dashboardPage().isEnergyDisplayed());
      case "HAVING FUN" -> Assert.assertTrue(rf.dashboardPage().isHavingFunDisplayed());
      case "LATEST TRANSACTIONS" -> Assert.assertTrue(rf.dashboardPage().isLatestTransactionsDisplayed());
      default -> throw new ReniExceptions("Nu exista acel text");
    }

  }

  @Then("the field {string} is present in dashboard")
  public void theFieldIsPresentInDashboard(String field) {
    switch (field.toUpperCase()) {
      case "USERS" -> Assert.assertTrue(rf.dashboardPage().isUssersDisplayed());
      case "NUMBER USERS" -> Assert.assertTrue(rf.dashboardPage().isNumberUsersDisplayed());
      case "ARROW USERS" -> Assert.assertTrue(rf.dashboardPage().isArrowDisplayed());
      case "SEE ALL USERS" -> Assert.assertTrue(rf.dashboardPage().isSeeAllUsersDisplayed());
      case "ICON USERS" -> Assert.assertTrue(rf.dashboardPage().isIconUsersDisplayed());

      case "PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isProductsDisplayed());
      case "NUMBER PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isProductsNumbersDisplayed());
      case "ARROW PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isProductsArrowDisplayed());
      case "SEE ALL PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isSeeAllProductsDisplayed());
      case "ICON PRODUCTS" -> Assert.assertTrue(rf.dashboardPage().isProductsIconDisplayed());

      case "BUDGET" -> Assert.assertTrue(rf.dashboardPage().isBudgetDisplayed());
      case "ARROW BUDGET" -> Assert.assertTrue(rf.dashboardPage().isArrowBudgetDisplayed());
      case "BUDGET NUMBERS" -> Assert.assertTrue(rf.dashboardPage().isBudgetNumbersDisplayed());
      case "BUDGET SYMBOL" -> Assert.assertTrue(rf.dashboardPage().isBudgetSymbolDisplayed());

      case "HAPPYNESS" -> Assert.assertTrue(rf.dashboardPage().isHappynessSymbolDisplayed());
      case "HAPPYNESS NUMBER" -> Assert.assertTrue(rf.dashboardPage().isHappynesNumberDisplayed());
      case "ARROW HAPPYNESS" -> Assert.assertTrue(rf.dashboardPage().isArrowHappynessDisplayed());
      case "HAPPYNESS SYMBOL" -> Assert.assertTrue(rf.dashboardPage().isHappynessSymbolDisplayed());

      case "ENERGY" -> Assert.assertTrue(rf.dashboardPage().isEnergyDisplayed());
      case "ENERGY CHART" -> Assert.assertTrue(rf.dashboardPage().isEnergyChartDisplayed());
      case "ENERGY TEXT" -> Assert.assertEquals(rf.dashboardPage().getEergyText(),"Total energy remains for today");

      default -> throw new ReniExceptions("Nu exista acel text");

    }
//    System.out.println(rf.dashboardPage().getNumberUsersText());
  }



  @Then("check the arrow color")
  public void checkTheArrowColor() {

    SoftAssert softAssert = new SoftAssert();

    String usersColor = "";
    if (rf.dashboardPage().getUsersArrowStatus().equals("Up")) {
      usersColor = "rgba(0, 128, 0, 1)";
    } else {
      usersColor = "rgba(255, 0, 0, 1)";
    }
    String productsColor = "";
    if (rf.dashboardPage().getProductsArrowStatus().equals("Up")) {
      productsColor = "rgba(0, 128, 0, 1)";
    } else {
      productsColor = "rgba(255, 0, 0, 1)";
    }
    String budgetColor = "";
    if (rf.dashboardPage().getBudgetArrowStatus().equals("Up")) {
      budgetColor = "rgba(0, 128, 0, 1)";
    } else {
      budgetColor = "rgba(255, 0, 0, 1)";
    }
    String happynessColor = "";
    if (rf.dashboardPage().getHappynessArrowStatus().equals("Up")) {
      happynessColor = "rgba(0, 128, 0, 1)";
    } else {
      happynessColor = "rgba(255, 0, 0, 1)";
    }
    String energyTargetColor = "";
    if (rf.dashboardPage().getEnergyTargetArrowStatus().equals("Up")) {
      energyTargetColor = "rgba(0, 128, 0, 1)";
    } else {
      energyTargetColor = "rgba(255, 0, 0, 1)";
    }
    String energyWeekColor = "";
    if (rf.dashboardPage().getEnergyWeekArrowStatus().equals("Up")) {
      energyWeekColor = "rgba(0, 128, 0, 1)";
    } else {
      energyWeekColor = "rgba(255, 0, 0, 1)";
    }
    String energyMonthColor = "";
    if (rf.dashboardPage().getEnergyMonthArrowStatus().equals("Up")) {
      energyMonthColor = "rgba(0, 128, 0, 1)";
    } else {
      energyMonthColor = "rgba(255, 0, 0, 1)";
    }
    String funTargetColor = "";
    if (rf.dashboardPage().getFunTargetArrowStatus().equals("Up")) {
      funTargetColor = "rgba(0, 128, 0, 1)";
    } else {
      funTargetColor = "rgba(255, 0, 0, 1)";
    }
    String funWeekColor = "";
    if (rf.dashboardPage().getFunWeekArrowStatus().equals("Up")) {
      funWeekColor = "rgba(0, 128, 0, 1)";
    } else {
      funWeekColor = "rgba(255, 0, 0, 1)";
    }
    String funMonthColor = "";
    if (rf.dashboardPage().getFunMonthArrowStatus().equals("Up")) {
      funMonthColor = "rgba(0, 128, 0, 1)";
    } else {
      funMonthColor = "rgba(255, 0, 0, 1)";
    }

//    Assert.assertEquals(rf.dashboardPage().getUsersStaatusColor(), color);

    softAssert.assertEquals(rf.dashboardPage().getUsersStaatusColor(), usersColor);
    softAssert.assertEquals(rf.dashboardPage().getProductsStatusColor(), productsColor);
    softAssert.assertEquals(rf.dashboardPage().getBudgetStatusColor(), budgetColor);
    softAssert.assertEquals(rf.dashboardPage().getHappynessStatusColor(), happynessColor);
    softAssert.assertEquals(rf.dashboardPage().getEnergyTargetStatusColor(), energyTargetColor);
    softAssert.assertEquals(rf.dashboardPage().getEnergyWeektStatusColor(), energyWeekColor);
    softAssert.assertEquals(rf.dashboardPage().getEnergyMonthtStatusColor(), energyMonthColor);
    softAssert.assertEquals(rf.dashboardPage().getFunTargetStatusColor(), funTargetColor);
    softAssert.assertEquals(rf.dashboardPage().getFunWeekStatusColor(), funWeekColor);
    softAssert.assertEquals(rf.dashboardPage().getFunMonthStatusColor(), funMonthColor);

    softAssert.assertAll();
  }
}



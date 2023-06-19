package com.reni.steps;


import com.reni.core.exceptions.ReniExceptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DashboardSteps extends BaseStep {

  @Given("I visit {string}")
  public void iVisit(String arg0) {
    driver.navigate().to(arg0);
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

      default -> throw new ReniExceptions("Nu exista acel text");

    }
//    System.out.println(rf.dashboardPage().getNumberUsersText());
  }

  @Then("the field {string} is present in dashboard page")
  public void theFieldIsPresentInDashboardPage(String field) {

    switch (field.toUpperCase()) {

      case "ENERGY" -> Assert.assertTrue(rf.dashboardPage().isEnergyDisplayed());
      case "ENERGY CHART" -> Assert.assertTrue(rf.dashboardPage().isEnergyChartDisplayed());
      case "ENERGY TEXT" -> Assert.assertEquals(rf.dashboardPage().getEnergyText(), "Total energy remains for today");
      case "ENERGY PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isEnergyDisplayed());
      case "ENERGY LEVEL" -> Assert.assertEquals(rf.dashboardPage().getEnergyLevelStatsText(), "Energy level stats");
      case "ENERGY TARGET" -> Assert.assertEquals(rf.dashboardPage().getEnergyTargetText(), "Target");
      case "ENERGY TARGET PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isEnergyTargetPercentageDisplayed());
      case "ENERGY WEEK" -> Assert.assertEquals(rf.dashboardPage().getEnergyWeektText(), "Last Week");
      case "ENERGY WEEK PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isEnergyWeekPercentageDisplayed());
      case "ENERGY MONTH" -> Assert.assertEquals(rf.dashboardPage().getEnergyMonthText(), "Month");
      case "ENERGY MONTH PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isEnergyMonthPercentageDisplayed());

      case "FUN" -> Assert.assertTrue(rf.dashboardPage().isHavingFunDisplayed());
      case "FUN CHART" -> Assert.assertTrue(rf.dashboardPage().isFunChartDisplayed());
      case "FUN TEXT" -> Assert.assertEquals(rf.dashboardPage().getHavingFunText(), "Total happyness reached today");
      case "FUN LEVEL" -> Assert.assertEquals(rf.dashboardPage().getHavingFunLevel(), "Happyness stats");
      case "FUN PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isHavingFunPercentageDisplayed());
      case "FUN TARGET" -> Assert.assertEquals(rf.dashboardPage().getHavingFunTargetText(), "Target");
      case "FUN TARGET PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isHavingFunTargetPercentageDisplayed());
      case "FUN WEEK" -> Assert.assertEquals(rf.dashboardPage().getHavingFunWeekText(), "Last Week");
      case "FUN WEEK PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isHavingFunWeekPercentageDisplayed());
      case "FUN MONTH" -> Assert.assertEquals(rf.dashboardPage().getHavingFunMonthText(), "Month");
      case "FUN MONTH PERCENTAGE" -> Assert.assertTrue(rf.dashboardPage().isHavingFunMonthPercentageDisplayed());

      default -> throw new ReniExceptions("Nu exista acel text");

    }
  }

  @Then("the area {string} is present in dashboard page")
  public void theAreaIsPresentInDashboardPage(String area) {

    switch (area.toUpperCase()) {

      case "TABLE HEADER" -> Assert.assertTrue(rf.dashboardPage().isTableHeaderDisplayed());
      case "TRACKING ID" -> Assert.assertTrue(rf.dashboardPage().isTrackingIdDisplayed());
      case "PRODUCT" -> Assert.assertTrue(rf.dashboardPage().isProductDisplayed());
      case "VENDOR" -> Assert.assertTrue(rf.dashboardPage().isVendorDisplayed());
      case "DATE" -> Assert.assertTrue(rf.dashboardPage().isDaterDisplayed());
      case "AMOUNT" -> Assert.assertTrue(rf.dashboardPage().isAmountrDisplayed());
      case "PAYMENT METHOD" -> Assert.assertTrue(rf.dashboardPage().isPaymentMethodDisplayed());
      case "STATUS" -> Assert.assertTrue(rf.dashboardPage().isStatusDisplayed());

      default -> throw new ReniExceptions("Nu exista acel text");
    }

  }

  @Then("the status colors for {string} is present in dashboard page for each line")
  public void theStatusForIsPresentInDashboardPage(String status) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(isStatusApprovedorPending(rf.dashboardPage().getTableStatusColorField1()));
    softAssert.assertTrue(isStatusApprovedorPending(rf.dashboardPage().getTableStatusColorField2()));
    softAssert.assertTrue(isStatusApprovedorPending(rf.dashboardPage().getTableStatusColorField3()));
    softAssert.assertTrue(isStatusApprovedorPending(rf.dashboardPage().getTableStatusColorField4()));
    softAssert.assertTrue(isStatusApprovedorPending(rf.dashboardPage().getTableStatusColorField5()));

    softAssert.assertAll();
  }

  private boolean isStatusApprovedorPending(String status_color) {

    return status_color.equals("rgba(0, 128, 0, 1)") || status_color.equals("rgba(218, 165, 32, 1)");

  }

  @Then("the payment status for {string} is present in dashboard page for each line")
  public void thePaymentStatusForIsPresentInDashboardPageForEachLine(String payment) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(isPaymentMethodCreditOrCash(rf.dashboardPage().getTablePaymentMethodField1()));
    softAssert.assertTrue(isPaymentMethodCreditOrCash(rf.dashboardPage().getTablePaymentMethodField2()));
    softAssert.assertTrue(isPaymentMethodCreditOrCash(rf.dashboardPage().getTablePaymentMethodField3()));
    softAssert.assertTrue(isPaymentMethodCreditOrCash(rf.dashboardPage().getTablePaymentMethodField4()));
    softAssert.assertTrue(isPaymentMethodCreditOrCash(rf.dashboardPage().getTablePaymentMethodField5()));

    softAssert.assertAll();

  }

  private boolean isPaymentMethodCreditOrCash(String actual_value) {
    if (actual_value.equals("Credit Card") || actual_value.equals("Cash on Delivery")) {
      return true;
    } else {
      return false;
    }

  }

  @Then("the number for {string} is present in dashboard page for each line")
  public void theNumberForIsPresentInDashboardPageForEachLine(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(isAmountWithinLimits(rf.dashboardPage().getTableAmountField1()));
    softAssert.assertTrue(isAmountWithinLimits(rf.dashboardPage().getTableAmountField2()));
    softAssert.assertTrue(isAmountWithinLimits(rf.dashboardPage().getTableAmountField3()));
    softAssert.assertTrue(isAmountWithinLimits(rf.dashboardPage().getTableAmountField4()));
    softAssert.assertTrue(isAmountWithinLimits(rf.dashboardPage().getTableAmountField5()));

    softAssert.assertAll();

  }

  private boolean isAmountWithinLimits(int actual_value) {

    if (actual_value >= 0 && actual_value <= 6999) {
      return true;
    } else {
      return false;
    }

  }

  @Then("the correct data format for {string} is present in dashboard page for each line")
  public void theCorrectDataFormatForIsPresentInDashboardPageForEachLine() {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.dashboardPage().getTableDateField1(), "1 March 2023");
    softAssert.assertEquals(rf.dashboardPage().getTableDateField2(), "10 March 2023");
    softAssert.assertEquals(rf.dashboardPage().getTableDateField3(), "4 April 2023");
    softAssert.assertEquals(rf.dashboardPage().getTableDateField4(), "4 February 2023");
    softAssert.assertEquals(rf.dashboardPage().getTableDateField5(), "23 January 2023");

    softAssert.assertAll();
  }

  @Then("the name & icon product for {string} is present in dashboard page for each line")
  public void theNameIconProductForIsPresentInDashboardPageForEachLine(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(rf.dashboardPage().isTableProductIconField1Displayed());
    softAssert.assertEquals(rf.dashboardPage().getTableProducNametField1(), "Beef Bones");

    softAssert.assertTrue(rf.dashboardPage().isTableProductIconField2Displayed());
    softAssert.assertEquals(rf.dashboardPage().getTableProducNametField2(), "Cruncy Bones");

    softAssert.assertTrue(rf.dashboardPage().isTableProductIconField3Displayed());
    softAssert.assertEquals(rf.dashboardPage().getTableProducNametField3(), "Burgers");

    softAssert.assertTrue(rf.dashboardPage().isTableProductIconField4Displayed());
    softAssert.assertEquals(rf.dashboardPage().getTableProducNametField4(), "Blackberries");

    softAssert.assertTrue(rf.dashboardPage().isTableProductIconField5Displayed());
    softAssert.assertEquals(rf.dashboardPage().getTableProducNametField5(), "Beans");

    softAssert.assertAll();
  }

  @Then("the id number for {string} is present in dashboard page for each line")
  public void theIdNumberForIsPresentInDashboardPageForEachLine(String id) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.dashboardPage().getTableIdField1Text().length(), 6);
    softAssert.assertEquals(rf.dashboardPage().getTableIdField1Text(), "123456");

    softAssert.assertEquals(rf.dashboardPage().getTableIdField2Text().length(), 6);
    softAssert.assertEquals(rf.dashboardPage().getTableIdField2Text(), "333457");

    softAssert.assertEquals(rf.dashboardPage().getTableIdField3Text().length(), 6);
    softAssert.assertEquals(rf.dashboardPage().getTableIdField3Text(), "624458");

    softAssert.assertEquals(rf.dashboardPage().getTableIdField4Text().length(), 6);
    softAssert.assertEquals(rf.dashboardPage().getTableIdField4Text(), "223559");

    softAssert.assertEquals(rf.dashboardPage().getTableIdField5Text().length(), 6);
    softAssert.assertEquals(rf.dashboardPage().getTableIdField5Text(), "823460");

    softAssert.assertAll();

  }

  @Then("check the arrow color")
  public void checkTheArrowColor() {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getUsersStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getProductsStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getBudgetStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getHappynessStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getEnergyTargetStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getEnergyWeektStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getEnergyMonthtStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getFunTargetStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getFunWeekStatusColor()));
    softAssert.assertTrue(isArrowColorRedOrGreen(rf.dashboardPage().getFunMonthStatusColor()));

    softAssert.assertAll();

  }

  private boolean isArrowColorRedOrGreen(String arrow_color) {
    if (arrow_color.equals("rgba(0, 128, 0, 1)") || arrow_color.equals("rgba(255, 0, 0, 1)")) {
      return true;
    } else {
      return false;
    }
  }

}







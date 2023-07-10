package com.reni.steps;

import com.reni.core.utils.Await;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ProductsSteps extends BaseStep{
  @Then("I check the table is preset" )
  public void iCheckTheTableIsPreset() {

    Assert.assertTrue(rf.productsPage().isProductsTableDisplayed());

  }

  @And("I check {string} column is present" )
  public void iCheckColumnIsPresent(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.productsPage().getFoodColumnText(), "Food (100g serving)");
    softAssert.assertEquals(rf.productsPage().getCaloriesColumnText(), "Calories");
    softAssert.assertEquals(rf.productsPage().getProteinColumnText(), "Proteing (g)");
    softAssert.assertEquals(rf.productsPage().getCarbsColumnText(),"Carbs (g)");
    softAssert.assertEquals(rf.productsPage().getFatColumnText(),"Fat (g)");

    softAssert.assertAll();

  }

  @Then("I click on the Blackberries arrow and the menu expands")
  public void iClickOnTheBlackberriesArrowAndTheMenuExpands() {
    rf.productsPage().BlackberriesArrowClick();
  }

  @And("the following text is present {string}")
  public void theFollowingTextIsPresent(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    Await.until(()->rf.productsPage().isBlackberriesExpandDisplayed());

    softAssert.assertEquals(rf.productsPage().getHistoryText(), "History");
    softAssert.assertEquals(rf.productsPage().getDateText(), "Date");
    softAssert.assertEquals(rf.productsPage().getCustomerText(), "Customer");
    softAssert.assertEquals(rf.productsPage().getAmountText(), "Amount");
    softAssert.assertEquals(rf.productsPage().getTotalPriceEurText(), "Total price (Eur)");


    softAssert.assertAll();
  }


  @And("the menu expands for Blackberries")
  public void theMenuExpandsForBlackberries() {

    rf.productsPage().BlackberriesArrowClick();
    Await.until(()->rf.productsPage().isBlackberriesExpandDisplayed());

    String toCheck = rf.productsPage().getCustomerField1Text();
    char[] convertToChar = toCheck.toCharArray();
    for (char c : convertToChar ) {
      if (Character.isDigit(c)) {
        Assert.fail("Found number in string: " + c);
      }
    }
  }


  @And("I check that amount field from History is integer")
  public void iCheckThatAmountFieldFromHistoryIsInteger() {
    rf.productsPage().BlackberriesArrowClick();
    Await.until(()->rf.productsPage().isBlackberriesExpandDisplayed());
    Assert.assertEquals(rf.productsPage().getAmountIsInt(), 2);
  }
}

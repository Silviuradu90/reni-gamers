package com.reni.steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class LoginSteps extends BaseStep {


  @Given("I go to {string}")

  public void goTo(String link) {
    driver.navigate().to("http://localhost:3000/");
  }


  @And("I write the following")
  public void iWriteTheFollowing(Map<String, String> Data) {
    Assert.assertTrue(rf.getLoginPage().isSidebarDisplay());
    rf.getLoginPage().writeUsername(Data.get("NAME"));
    rf.getLoginPage().writePassword(Data.get("PASSWORD"));

  }


  @And("I click Login Button")
  public void iClickLoginButton() {
    rf.getLoginPage().clickLoginButton();


  }


    @Then("I verify the login button color is teal")
    public void verifyLoginButtonColor() {
      WebElement loginButton = rf.getLoginPage().getLoginButton();

      String backgroundColor = loginButton.getCssValue("background-color");

      boolean isTealColor = backgroundColor.equals("rgba(0, 128, 128, 1)");

      Assert.assertTrue(isTealColor, "actual color :"+ backgroundColor);

    }


  }








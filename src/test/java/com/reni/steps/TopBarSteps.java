package com.reni.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TopBarSteps extends BaseStep {

  @Given("I go to {string}")
  public void iGoTo(String arg0) {
    driver.navigate().to("http://localhost:3000/dashboard");
  }

  @And("the field {string} in dashboard page exists")
  public void theFieldIngetLeftSideBarExists(String field) {

    switch (field.toUpperCase()) {
      case "SEARCHENGINE" -> Assert.assertTrue(rf.getTopBar().isSearchEngineDisplayed());
      case "LANGUAGEDISPLAYED" -> Assert.assertTrue(rf.getTopBar().isLanguageDisplayed());
      case "LANGUAGETEXT" -> Assert.assertEquals(rf.getTopBar().getLanguageText(), "Woof Woof1");
      case "THEME" -> Assert.assertTrue(rf.getTopBar().isThemeDisplayed());
      case "NOTIFICATION" -> Assert.assertTrue(rf.getTopBar().isNotificationDisplayed());
      case "MESSAGES" -> Assert.assertTrue(rf.getTopBar().isMessagesDisaplyed());
      case "PROFILE" -> Assert.assertTrue(rf.getTopBar().isProfileDisplayed());
    }
  }
    @Then("I write {string} and hit enter")
    public void iClickOnOnThePage (String value){
      rf.getTopBar().writeSearchInput(value);
    }

  }

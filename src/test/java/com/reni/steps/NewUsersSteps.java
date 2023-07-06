package com.reni.steps;

import com.reni.core.utils.Await;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class NewUsersSteps extends BaseStep {

  @Given("I am on {string}")
  public void iAmOn(String link) {
    driver.navigate().to(link);
  }

  @Then("the field {string} in add new user page exists")
  public void theFieldInAddNewUserPageExists(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertTrue(rf.newUsersPage().isAddNewUserDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isPictureAreaDisplayed());

    softAssert.assertTrue(rf.newUsersPage().isButtonUploadPictureDisplayed());

    softAssert.assertTrue(rf.newUsersPage().isNameAndSurnameFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isPhoneNumberFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isAddressFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isUsernameFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isEmailFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isPasswordFieldDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isAgeDropdownDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isCountryDropdownDisplayed());
    softAssert.assertTrue(rf.newUsersPage().isSubmitButtonDisplayed());

    softAssert.assertAll();
  }

  @And("the field {string} has green text")
  public void theFieldHasGreenText(String arg0) {
    Assert.assertEquals(rf.newUsersPage().isAddNewUserGreenDisplayed(), "rgba(0, 128, 0, 1)");
  }


  @Then("the text and button for {string} in add new user page exists")
  public void theTextAndButtonForInAddNewUserPageExists(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getUploadImageText(), "Upload Image:");
    softAssert.assertTrue(rf.newUsersPage().isButtonUploadPictureDisplayed());

    softAssert.assertAll();
  }

  @Then("the text and field for {string} in add new user page exists")
  public void theTextAndFieldForInAddNewUserPageExists(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getNameAndSurnameText(), "Name and surname");
    softAssert.assertEquals(rf.newUsersPage().getNameAndSurnamePlaceholder(), "John Doe");

    softAssert.assertAll();

  }

  @Then("the text and field with number for {string} in add new user page exists")
  public void theTextAndFieldWithNumberForInAddNewUserPageExists(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getPhoneText(), "Phone");
    softAssert.assertEquals(rf.newUsersPage().getPhoneNumberFieldText(), "+1 234 567 89");

    softAssert.assertAll();
  }

  @Then("the text and field with address for {string} in add new user page exists")
  public void theTextAndFieldWithAddressForInAddNewUserPageExists(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getAddressText(), "Address");
    softAssert.assertEquals(rf.newUsersPage().getAdressFieldText(), "Elton St. 216 NewYork");

    softAssert.assertAll();
  }

  @Then("the text and field with name for {string} in add new user page exists")
  public void theTextAndFieldWithNameForInAddNewUserPageExists(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getUsernameText(), "Username");
    softAssert.assertEquals(rf.newUsersPage().getUsernameFieldText(), "john_doe");

    softAssert.assertAll();
  }

  @Then("the text and field with email for {string} in add new user page exists")
  public void theTextAndFieldWithEmailForInAddNewUserPageExists(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getEmailText(), "Email");
    softAssert.assertEquals(rf.newUsersPage().getEmailFieldText(), "john_doe@gmail.com");

    softAssert.assertAll();


  }

  @Then("the text and empty field for {string} in add new user page exists")
  public void theTextAndEmptyFieldForInAddNewUserPageExists(String arg0) {
    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getPasswordText(), "Password");
    softAssert.assertTrue(rf.newUsersPage().getPasswordFieldText().isEmpty());

    softAssert.assertAll();

  }

  @Then("the text and Age dropdown for {string} in add new user page exists")
  public void theTextAndAgeDropdownForInAddNewUserPageExists(String arg0) {

    SoftAssert softAssert = new SoftAssert();

    softAssert.assertEquals(rf.newUsersPage().getAgeRangeText(), "Age Range\n*");

    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());
    softAssert.assertEquals(rf.newUsersPage().getValuesFromDropdownAgeList().toString(), "[Not Born yet!, 1-19, 20-29, 30-39, 40-49, 50-59, 60+]");



    rf.newUsersPage().clickNotBornYetField();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "Not Born yet!");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click1_19Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "1-19");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click20_29Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "20-29");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click30_39Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "30-39");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click40_49Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "40-49");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click50_59Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "50-59");


    rf.newUsersPage().clickAgeDropdown();

    Await.until(()->rf.newUsersPage().isAgeRangeListDisplayed());

    rf.newUsersPage().click60Field();
    softAssert.assertEquals(rf.newUsersPage().getAgeRangeInsideText(), "60+");


    softAssert.assertAll();
  }

  @Then("the dropdown for {string} is present")
  public void theDropdownForIsGreen(String arg0) {

    Assert.assertTrue(rf.newUsersPage().isCountryDropdownDisplayed());
  }

  @And("I click on {string} from dropdown")
  public void iClickOnFromDropdown(String country) throws InterruptedException {

    if (rf.newUsersPage().isRemoveCountryDisplayed())rf.newUsersPage().clickRemoveButton();

    rf.newUsersPage().clickCountryDropdown();
    rf.newUsersPage().selectCountry(country);

    Assert.assertEquals(rf.newUsersPage().getCountryText(), country);
  }


  @Then("upload picture button is present and can upload {string}")
  public void uploadPictureButtonIsPresentAndCanUpload(String picture) {
    rf.newUsersPage().uploadPicture(picture);

    Assert.assertTrue(rf.newUsersPage().isPictureUploaded());
  }

  @Then("the color for {string} button is green")
  public void theColorForButtonIsGreen(String arg0) {
    Assert.assertEquals(rf.newUsersPage().getSubmitButtonColor(), "rgba(0, 128, 0, 1)");
  }

  @Then("click the {string} button")
  public void clickTheButton(String arg0) {

    rf.newUsersPage().clickSubmitButton();
    System.out.println("test123" + rf.newUsersPage().getAgeRangeText());

  }

  @And("the Age Range Dropdown is mandatory")
  public void theAgeRangeDropdownIsMandatory() {
    Assert.assertEquals(rf.newUsersPage().getAgeRangeMandatoryMessageDisplayed(), "Please fill out this field.");
  }
}



package com.reni.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UsersSteps extends BaseStep {


  @And("I check for Add user button")
  public void iCheckForAddUserButton() {
    Assert.assertTrue(rf.getUsersPage().isAddUserButtonDisplayed());

  }

  @And("I check if there is a data table")
  public void iCheckIfThereIsADataTable() {
    Assert.assertTrue(rf.getUsersPage().isUserTableDisplayed());

  }

  @Then("I check if the Add new user button is green")
  public void iCheckIfTheAddNewUserButtonIsGreen() {
    boolean isGreenColor = rf.getUsersPage().getAddNewUsersButtonColor().equals("rgba(0, 128, 0, 1)");
    Assert.assertTrue(isGreenColor, "actual color :" + rf.getUsersPage().getAddNewUsersButtonColor());

  }

  @And("I check for Checkbox")
  public void iCheckForCheckbox() throws InterruptedException {
    Assert.assertTrue(rf.getUsersPage().isCheckBoxDisplayed());
  }

  @And("I check for ID Tab")
  public void iCheckForID() {
    Assert.assertTrue(rf.getUsersPage().isCheckIdDisplayed());

  }


  @And("I check for User Tab")
  public void iCheckForUserTab() {
    Assert.assertTrue(rf.getUsersPage().isCheckUserTabDisplayed());

  }


  @And("I check for Email Tab")
  public void iCheckForEmailTab() {
    Assert.assertTrue(rf.getUsersPage().isCheckEmailTabDisplayed());

  }

  @And("I check for Age Tab")
  public void iCheckForAgeTab() {
    Assert.assertTrue(rf.getUsersPage().isCheckAgeTabDisplayed());

  }

  @And("I check for Action Tab")
  public void iCheckForActionTab() {
    Assert.assertTrue(rf.getUsersPage().isCheckStatusTabDisplayed());

  }

  @And("I check for Next Page Button")
  public void iCheckForNextPageButton() {
    Assert.assertTrue(rf.getUsersPage().isCheckNextPageButtonDisplayed());

  }


  @And("I check for Profile photo and Full Name")
  public void iCheckForProfilePhotoAndFullName() {
    Assert.assertTrue(rf.getUsersPage().getCheckCellWithPhoto());
    Assert.assertTrue(rf.getUsersPage().getFullName().length() > 3);
  }

  @And("I check for full email address")
  public void iCheckForFullEmailAddress() {
    Assert.assertTrue(rf.getUsersPage().getCheckFullEmail());
  }

  @And("I check Active status field color")
  public void iCheckTheColorsOfTheStatusField() {
    WebElement CheckForActiveStatusFieldColors = rf.getUsersPage().getCheckActiveStatusFieldColor();
    String backgroundColor = CheckForActiveStatusFieldColors.getCssValue("color");
    boolean isActiveColor = backgroundColor.equals("rgba(0, 128, 0, 1)");
    Assert.assertTrue(isActiveColor, "actual color :" + backgroundColor);

  }

  @And("I check Inactive status field color")
  public void iCheckInactiveStatusFieldColor() {
    WebElement CheckForInactiveStatusFieldColors = rf.getUsersPage().getCheckInactiveStatusFieldColor();
    String backgroundColor = CheckForInactiveStatusFieldColors.getCssValue("color");
    boolean isInactiveColor = backgroundColor.equals("rgba(220, 20, 60, 1)");
    Assert.assertTrue(isInactiveColor, "actual color :" + backgroundColor);


  }

  @And("I check Pending status field color")
  public void iCheckPendingStatusFieldColor() {
    WebElement CheckForPendingStatusFieldColors = rf.getUsersPage().getCheckPendingStatusFieldColor();
    String backgroundColor = CheckForPendingStatusFieldColors.getCssValue("color");
    boolean isPendingColor = backgroundColor.equals("rgba(218, 165, 32, 1)");
    Assert.assertTrue(isPendingColor, "actual color :" + backgroundColor);


  }

  @And("I check the View button")
  public void iCheckTheViewButton() {
    WebElement CheckForViewButtonColor = rf.getUsersPage().getViewButton();
    String backgroundColor = CheckForViewButtonColor.getCssValue("color");
    boolean isViewButtonColor = backgroundColor.equals("rgba(0, 0, 139, 1)");
    Assert.assertTrue(isViewButtonColor, "actual color :" + backgroundColor);

  }


  @And("I check the Delete button")
  public void iCheckTheDeleteButton() {
    WebElement CheckForDeleteButtonColor = rf.getUsersPage().getCheckDeleteButtonColor();
    String backgroundColor = CheckForDeleteButtonColor.getCssValue("color");
    boolean isDeleteButtonColor = backgroundColor.equals("rgba(220, 20, 60, 1)");
    Assert.assertTrue(isDeleteButtonColor, "actual color :" + backgroundColor);
  }

  @And("I click the View Button")
  public void iClickTheViewButton() {
    rf.getUsersPage().clickViewButton();
    Assert.assertTrue(rf.getUsersPage().CheckUserProfilePage());
  }


  @And("I delete the user and check if it's deleted")
  public void iDeleteTheUserAndCheckIfItSDeleted() {
    String currentUser = rf.getUsersPage().getFullName();
    rf.getUsersPage().clickDeleteUser();
    String newUser = rf.getUsersPage().getFullName();
    Assert.assertTrue(rf.getUsersPage().CheckDeletedUser());
    Assert.assertNotEquals(currentUser, newUser);
  }

  @And("I check when all deleted users No rows is displayed")
  public void iCheckWhenAllDeletedUsersNoRowsIsDisplayed() {
    rf.getUsersPage().DeleteAllUsers();
    Assert.assertEquals(rf.getUsersPage().CheckForNoRows(), "No rows");

  }
}


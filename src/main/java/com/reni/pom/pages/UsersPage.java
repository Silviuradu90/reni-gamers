package com.reni.pom.pages;

import com.reni.pom.AbstractPage;
import io.cucumber.java.mk_latn.No;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage extends AbstractPage {

  @FindBy(xpath = "//*[text()='Users']")
  private WebElement clickUserButton;

  @FindBy(xpath = "//*[@href='/users/new']")
  private WebElement UserButton;

  @FindBy(xpath = "//*[@class='datatable']")
  private WebElement userTable;

  //help
  @FindBy(xpath = "//*[@href='/users/new']")
  private WebElement UserButtonColor;

  @FindBy(xpath = "/html/body/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]/div/div/div[1]/div[1]/div/div/span")
  private WebElement CheckBox;

  @FindBy(xpath = "//*[@aria-label='ID']")
  private WebElement CheckId;

  @FindBy(xpath = "//*[@aria-label='User']")
  private WebElement CheckUserTab;
  @FindBy(xpath = "//*[@aria-label='Email']")
  private WebElement CheckEmailTab;
  @FindBy(xpath = "//*[@aria-label='Age']")
  private WebElement CheckAgeTab;
  @FindBy(xpath = "//*[@aria-label='Status']")
  private WebElement CheckStatusTab;
  @FindBy(xpath = "//*[@d='M8.59 16.34l4.58-4.59-4.58-4.59L10 5.75l6 6-6 6z']")
  private WebElement CheckNextPageButton;

  @FindBy(xpath = "//*[@class='cellWithImg']")
  private WebElement CheckCellWithPhoto;

  @FindBy(xpath = "//*[contains(text(), '@hopefullyNotActive.com')]")
  private WebElement CheckFullEmail;

  @FindBy(xpath = "//*[@class='cellWithStatus Active']")
  private WebElement CheckActiveStatusFieldColor;


  @FindBy(xpath = "//*[@class='cellWithStatus Inactive']")
  private WebElement CheckInactiveStatusFieldColor;


  @FindBy(xpath = "//*[@class='cellWithStatus Pending']")
  private WebElement CheckPendingStatusFieldColor;


  @FindBy(xpath = "//*[@class='viewButton']")
  private WebElement ViewButton;

  @FindBy(xpath = "//*[@class='deleteButton']")
  private WebElement CheckDeleteButtonColor;

  @FindBy(xpath = "//*[@class='deleteButton']")
  private List<WebElement> DeleteButtonList;

  @FindBy(xpath = "//div[contains(text(), 'User Happiness')]")
  private WebElement CheckUserProfilePage;

  @FindBy(xpath = "//div[@class='deleteButton']")
  private WebElement DeleteButton;

  @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-overlay')]")
  private WebElement NoRows;

  //  No rows Xpath


  public void clickAddUserButton() {
    UserButtonColor.click();
  }

  public boolean isUserTableDisplayed() {
    return userTable.isDisplayed();

  }

  public boolean isAddUserButtonDisplayed() {
    return UserButton.isDisplayed();

  }

  public boolean setUserTable() {
    return userTable.isDisplayed();

  }

//  public WebElement getAddNewUsersButton() {
//    return UserButtonColor;
//  }
    public String getAddNewUsersButtonColor(){
    return UserButtonColor.getCssValue("color");
  }


  public boolean isCheckBoxDisplayed() {
    return CheckBox.isDisplayed();
  }

  public boolean isCheckIdDisplayed() {
    return CheckId.isDisplayed();
  }

  public boolean isCheckUserTabDisplayed() {
    return CheckUserTab.isDisplayed();
  }

  public boolean isCheckEmailTabDisplayed() {
    return CheckEmailTab.isDisplayed();
  }

  public boolean isCheckAgeTabDisplayed() {
    return CheckAgeTab.isDisplayed();
  }

  public boolean isCheckStatusTabDisplayed() {
    return CheckStatusTab.isDisplayed();
  }

  public Boolean isCheckNextPageButtonDisplayed() {
    return CheckNextPageButton.isDisplayed();
  }

  public boolean getCheckCellWithPhoto() {
    return CheckCellWithPhoto.isDisplayed();
  }

  public String getFullName() {
    return CheckCellWithPhoto.getText();
  }

  public boolean getCheckFullEmail() {
    return CheckFullEmail.isDisplayed();
  }

  public WebElement getCheckActiveStatusFieldColor() {
    return CheckActiveStatusFieldColor;
  }

  public WebElement getCheckInactiveStatusFieldColor() {
    return CheckInactiveStatusFieldColor;
  }

  public WebElement getCheckPendingStatusFieldColor() {
    return CheckPendingStatusFieldColor;
  }

  public WebElement getViewButton() {
    return ViewButton;
  }

  public WebElement getCheckDeleteButtonColor() {
    return CheckDeleteButtonColor;

  }

  public void clickViewButton() {
    ViewButton.click();
  }

  public boolean CheckUserProfilePage() {
    return CheckUserProfilePage.isDisplayed();
  }

  public void clickDeleteUser() {
    DeleteButton.click();
  }

  public boolean CheckDeletedUser() {
    return DeleteButton.isDisplayed();
  }


  public String CheckForNoRows() {
    return NoRows.getText();
  }

  public void DeleteAllUsers(){
    while (!DeleteButtonList.isEmpty()){
      DeleteButton.click();
    }
  }

}





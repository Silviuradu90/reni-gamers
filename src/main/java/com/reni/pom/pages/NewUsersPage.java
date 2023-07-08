package com.reni.pom.pages;

import com.reni.pom.AbstractPage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewUsersPage extends AbstractPage {

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/h1")
  private WebElement add_new_user;
  public boolean isAddNewUserDisplayed() {
    return add_new_user.isDisplayed();
  }
  public String isAddNewUserGreenDisplayed() {
    return add_new_user.getCssValue("color");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/img")
  private WebElement picture_area;
  public boolean isPictureAreaDisplayed() {
    return picture_area.isDisplayed();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[1]//*[contains(@focusable, 'false')]")
  private WebElement button_upload_picture;
  public boolean isButtonUploadPictureDisplayed() {
    return button_upload_picture.isDisplayed();
  }
  @FindBy(id="file")
  private WebElement upload_file;
  public void uploadPicture(String picture){
    File file = new File(("src\\test\\resources\\pictures\\" + picture));
    upload_file.sendKeys(file.getAbsolutePath());
  }

  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/img")
  private WebElement isUploaded;
  public boolean isPictureUploaded(){
    return isUploaded.getAttribute("src").contains("blob");
  }



  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[3]/input")
  private WebElement name_and_surname_field;
  public boolean isNameAndSurnameFieldDisplayed() {
    return name_and_surname_field.isDisplayed();
  }

  public String getNameAndSurnamePlaceholder() {
    return name_and_surname_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[3]/label")
  private WebElement name_and_surname_text;

  public String getNameAndSurnameText() {
    return name_and_surname_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[5]/input")
  private WebElement phone_number_field;

  public boolean isPhoneNumberFieldDisplayed() {
    return phone_number_field.isDisplayed();
  }

  public String getPhoneNumberFieldText() {
    return phone_number_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[5]/label")
  private WebElement phone_text;

  public String getPhoneText() {
    return phone_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[7]/input")
  private WebElement address_field;

  public boolean isAddressFieldDisplayed() {
    return address_field.isDisplayed();
  }

  public String getAdressFieldText() {
    return address_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[7]/label")
  private WebElement address_text;

  public String getAddressText() {
    return address_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[2]/input")
  private WebElement username_field;

  public boolean isUsernameFieldDisplayed() {
    return username_field.isDisplayed();
  }

  public String getUsernameFieldText() {
    return username_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[2]/label")
  private WebElement username_text;

  public String getUsernameText() {
    return username_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[4]/input")
  private WebElement email_field;

  public boolean isEmailFieldDisplayed() {
    return email_field.isDisplayed();
  }

  public String getEmailFieldText() {
    return email_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[4]/label")
  private WebElement email_text;

  public String getEmailText() {
    return email_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[6]/input")
  private WebElement password_field;

  public boolean isPasswordFieldDisplayed() {
    return password_field.isDisplayed();
  }

  public String getPasswordFieldText() {
    return password_field.getAttribute("placeholder");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[6]/label")
  private WebElement password_text;

  public String getPasswordText() {
    return password_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"select\"]")
  private WebElement age_range;

  public boolean isAgeDropdownDisplayed() {
    return age_range.isDisplayed();
  }

  public String getAgeRangeInsideText() {
    return age_range.getText();
  }

  public void clickAgeDropdown() {
    age_range.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]")
  private WebElement fullAgeRangeList;

  public boolean isAgeRangeListDisplayed(){
    return fullAgeRangeList.isDisplayed();
  }


  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[9]/div/label")
  private WebElement age_range_text;

  public String getAgeRangeText() {
    return age_range_text.getText();
  }

  @FindBy(xpath = "//*[@id='menu-']/div[3]/ul/li")
  private List<WebElement> dropdown_age_list;

  public List<String> getValuesFromDropdownAgeList() {
    List<String> dropdownValues = new ArrayList<>();
    for (WebElement element : dropdown_age_list) {
      dropdownValues.add(element.getText());
    }
    return dropdownValues;
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[1]/em")
  private WebElement click_field_not_born_yet;

  public void clickNotBornYetField() {
    click_field_not_born_yet.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[2]")
  private WebElement click_field_1_19;

  public void click1_19Field() {
    click_field_1_19.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[3]")
  private WebElement click_field_20_29;

  public void click20_29Field() {
    click_field_20_29.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[4]")
  private WebElement click_field_30_39;

  public void click30_39Field() {
    click_field_30_39.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[5]")
  private WebElement click_field_40_49;

  public void click40_49Field() {
    click_field_40_49.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[6]")
  private WebElement click_field_50_59;

  public void click50_59Field() {
    click_field_50_59.click();
  }

  @FindBy(xpath = "//*[@id=\"menu-\"]/div[3]/ul/li[7]")
  private WebElement click_field_60;

  public void click60Field() {
    click_field_60.click();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[9]/div/div/input")
  private WebElement ageRangeMandatoryMessage;

  public String getAgeRangeMandatoryMessageDisplayed() {
    return ageRangeMandatoryMessage.getAttribute("validationMessage");
  }


  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/button")
  private WebElement submit_button;

  public boolean isSubmitButtonDisplayed() {
    return submit_button.isDisplayed();
  }
  public String getSubmitButtonColor(){

  return submit_button.getCssValue("background-color");
  }

  public void clickSubmitButton(){
    submit_button.click();
  }

  @FindBy(xpath = "//*[@id=\"selectCountry\"]")
  private WebElement country_choose;

  public boolean isCountryDropdownDisplayed() {
    return country_choose.isDisplayed();
  }
  public void clickCountryDropdown(){
  country_choose.click();
  }

  public void selectCountry(String country){

    driver.findElement(By.xpath(String.format("//*[contains(text(), '%s')]", country))).click();
  }

  @FindBy(xpath = "//button[@title='Clear']")
  private WebElement removeCountry;

  public void clickRemoveButton(){
    removeCountry.click();
  }
  public boolean isRemoveCountryDisplayed(){
    try{
      return removeCountry.isDisplayed();
    } catch (NoSuchElementException e){
      return false;
    }
  }


  public String getCountryText(){
    return country_choose.getAttribute("value");
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/form/div[1]/label")
  private WebElement upload_image_text;

  public String getUploadImageText() {
    return upload_image_text.getText();
  }


}

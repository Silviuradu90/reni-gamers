package com.reni.pom.components;

import com.reni.pom.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends AbstractPage {

  @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div[1]/input")
  private WebElement searchEngine;

  @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div[2]/div[1]")
  private WebElement language;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[2]/div[2]/div")
  private WebElement theme;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[2]/div[3]/div[1]")
  private WebElement notification;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[1]/div/div[2]/div[4]/div[1]")
  private WebElement messages;

  @FindBy(xpath = "/html/body/div/div/div/div[2]/div[1]/div/div[2]/div[5]/img")
  private WebElement profile;


  public boolean isSearchEngineDisplayed() {
    return searchEngine.isDisplayed();
  }

  public boolean isLanguageDisplayed() {

    return language.isDisplayed();
  }

  public String getLanguageText() {

    return language.getText();
  }

  public boolean isThemeDisplayed() {

    return theme.isDisplayed();
  }

  public boolean isNotificationDisplayed() {
    return notification.isDisplayed();

  }

  public boolean isMessagesDisaplyed() {

    return messages.isDisplayed();
  }

  public boolean isProfileDisplayed() {

    return profile.isDisplayed();
  }

  public void writeSearchInput(String text) {
    searchEngine.sendKeys(text);
    searchEngine.sendKeys(Keys.ENTER);
  }


}

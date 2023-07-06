package com.reni.pom.pages;

import com.reni.pom.AbstractPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

  @FindBy(xpath = "//*[@placeholder='Username']")
  private WebElement USERNAME;

  @FindBy(xpath = "//*[@placeholder = 'password']")
  private WebElement PASSWORD;

  @FindBy(xpath = "//*[@href = '/dashboard']")
  private WebElement loginButtonElement;

  @FindBy(xpath = "//*[@href = '/dashboard']/button")
  private WebElement loginButtonColor;


  @FindBy(className = "sidebar")
  private WebElement sidebar;

  public boolean isSidebarDisplay() {
    try {
      return !sidebar.isDisplayed();
    } catch (NoSuchElementException e) {
      return true;
    }
  }

  public void writeUsername(String user) {
    USERNAME.sendKeys(user);
  }

  public void writePassword(String password) {
    PASSWORD.sendKeys(password);
  }

  public void clickLoginButton() {
    loginButtonElement.click();
  }

  public WebElement getLoginButton() {
    return loginButtonColor;
  }
}

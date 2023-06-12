package com.reni.pom.components;

import com.reni.pom.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftSideBar extends AbstractPage {

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/p[1]")
  private WebElement main;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/li/a/span")
  private WebElement dashboard;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/p[2]")
  private WebElement lists;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[1]/li/span")
  private WebElement users;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[2]/li/span")
  private WebElement products;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[3]/li/span")
  private WebElement progression;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[4]/li/span")
  private WebElement calendar_time;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/p[3]")
  private WebElement control_panel;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[5]/li/span")
  private WebElement settings;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[6]")
  private WebElement API;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[7]/li/span")
  private WebElement system_monitor;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[8]/li")
  private WebElement logs;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/p[4]")
  private WebElement user;
  @FindBy(xpath = "///*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[9]/li/span")
  private WebElement left_profile;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/ul/a[10]/li/span")
  private WebElement log_out;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/div[1]")
  private WebElement white_theme;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[3]/div[2]]")
  private WebElement black_theme;


  public boolean isMainDisplayed() {
    return main.isDisplayed();
  }

  public String getMainText() {
    return main.getText();
  }

  public boolean isDashbaordDisplayed() {
    return dashboard.isDisplayed();
  }

  public String getDashboardText() {
    return dashboard.getText();
  }

  public boolean isListsdDisplayed() {
    return lists.isDisplayed();
  }

  public String getListsText() {
    return lists.getText();
  }

  public boolean isUsersDisplayed() {
    return users.isDisplayed();
  }

  public String getUsersText() {
    return users.getText();
  }

  public boolean isProductsDisplayed() {
    return products.isDisplayed();
  }

  public String getProductsText() {
    return products.getText();
  }

  public boolean isProgressionDisplayed() {
    return progression.isDisplayed();
  }

  public String getProgressionText() {
    return progression.getText();
  }

  public boolean isCalendarTimeDisplayed() {
    return calendar_time.isDisplayed();
  }

  public String getCalendar_TimeText() {
    return calendar_time.getText();
  }

  public boolean isControlPanelDisplayed() {
    return control_panel.isDisplayed();
  }

  public String getControlPanelText() {
    return control_panel.getText();
  }

  public boolean isSettingsDisplayed() {
    return settings.isDisplayed();
  }

  public String getSettingsText() {
    return settings.getText();
  }

  public boolean isAPIDisplayed() {
    return API.isDisplayed();
  }

  public String getAPIText() {
    return API.getText();
  }

  public boolean isSystemMonitorDisplayed() {
    return system_monitor.isDisplayed();
  }

  public String getSystemMonitorText() {
    return system_monitor.getText();
  }

  public boolean isLogsDisplayed() {
    return logs.isDisplayed();
  }

  public String getLogsText() {
    return logs.getText();
  }

  public boolean isUserDisplayed() {
    return user.isDisplayed();
  }

  public String getUserText() {
    return user.getText();
  }

  public boolean isLeftProfileDisplayed() {
    return left_profile.isDisplayed();
  }

  public String getProfileText() {
    return left_profile.getText();
  }

  public boolean isLogOutDisplayed() {
    return log_out.isDisplayed();
  }

  public String getLogOutText() {
    return log_out.getText();
  }

  public boolean isWhiteThemDisplayed() {
    return white_theme.isDisplayed();
  }

  public boolean isWBlackThemeDisplayed() {
    return black_theme.isDisplayed();
  }


}

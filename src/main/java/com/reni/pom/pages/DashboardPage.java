package com.reni.pom.pages;

import com.reni.pom.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]")
  private WebElement users;


  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]")
  private WebElement products;
  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/span[2]")
  private WebElement products_number;
  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]/div")
  private WebElement arrow_products;
  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[1]/a/span")
  private WebElement seeAllProducts;
  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]")
  private WebElement productsIcon;

  public boolean isProductsNumbersDisplayed(){
    return products_number.isDisplayed();
  }
  public boolean isProductsArrowDisplayed(){
    return arrow_products.isDisplayed();
  }
  public boolean isSeeAllProductsDisplayed(){
    return seeAllProducts.isDisplayed();
  }
  public boolean isProductsIconDisplayed(){
    return productsIcon.isDisplayed();
  }



  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]")
  private  WebElement budget;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[1]/span[2]")
  private  WebElement budget_number;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]/div")
  private  WebElement arrow_budget;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]//*[contains(@data-testid,'MonetizationOnIcon')]")
  private  WebElement budget_symbol;

  public boolean isBudgetNumbersDisplayed(){
    return budget_number.isDisplayed();
  }
  public boolean isArrowBudgetDisplayed(){
    return arrow_budget.isDisplayed();
  }
  public boolean isBudgetSymbolDisplayed(){
    return budget_symbol.isDisplayed();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]")
  private  WebElement happyness;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[1]/span[2]")
  private  WebElement happyness_number;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[2]/div")
  private  WebElement arrow_happyness;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[2]//*[contains(@data-testid,'BalanceIcon')]")
  private  WebElement happyness_symbol;

  public boolean isHappynesNumberDisplayed(){
    return happyness_number.isDisplayed();
  }
  public boolean isArrowHappynessDisplayed(){
    return arrow_happyness.isDisplayed();
  }
  public boolean isHappynessSymbolDisplayed(){
    return happyness_symbol.isDisplayed();
  }





  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[1]")
  private  WebElement energy;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[1]//*[contains(@data-test-id,'CircularProgressbar')]")
  private  WebElement energy_chart;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/p[1]")
  private  WebElement energy_text;


  public boolean isEnergyChartDisplayed(){
    return energy_chart.isDisplayed();
  }
  public String getEergyText(){
    return energy_text.getText();
  }


  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]")
  private  WebElement having_fun;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[4]")
  private  WebElement latest_transactions;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/span[2]")
  private  WebElement number_users;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div")
  private  WebElement arrow_users;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[1]/a/span")
  private  WebElement all_users;
    @FindBy(css = "#root > div > div > div.homeContainer > div.widgets > div:nth-child(1) > div.right > svg")
  private  WebElement icon_users;

    @FindBy(css = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]")
  private  WebElement energy_month;


  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div//*[contains(@data-testid,'ArrowDrop')]")
  private  WebElement users_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div//*[contains(@data-testid,'ArrowDrop')]")
  private  WebElement products_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]/div//*[contains(@data-testid,'ArrowDrop')]")
  private  WebElement budget_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[2]/div//*[contains(@data-testid,'ArrowDrop')]")
  private  WebElement happyness_arrow;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement energy_target_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement energy_week_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement energy_month_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement fun_target_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement fun_week_arrow;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]//*[contains(@data-testid,'Arrow')]")
  private  WebElement fun_month_arrow;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[1]/div[2]/div")
  private  WebElement users_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[2]/div[2]/div")
  private  WebElement products_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[3]/div[2]/div")
  private  WebElement budget_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[2]/div[4]/div[2]/div")
  private  WebElement happyness_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]")
  private  WebElement energy_target_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]")
  private  WebElement energy_week_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]")
  private  WebElement energy_month_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]")
  private  WebElement fun_target_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]")
  private  WebElement fun_week_color;
    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]")
  private  WebElement fun_month_color;



  public boolean isUssersDisplayed(){
    return users.isDisplayed();
  }
  public boolean isProductsDisplayed(){
    return products.isDisplayed();
  }
  public boolean isBudgetDisplayed(){
    return budget.isDisplayed();
  }
  public boolean isHappynessDisplayed(){
    return happyness.isDisplayed();
  }
  public boolean isEnergyDisplayed(){
    return energy.isDisplayed();
  }
  public boolean isHavingFunDisplayed(){
    return having_fun.isDisplayed();
  }
  public boolean isLatestTransactionsDisplayed(){
    return latest_transactions.isDisplayed();
  }

  public boolean isNumberUsersDisplayed(){
    return number_users.isDisplayed();
  }
  public boolean isArrowDisplayed(){
    return arrow_users.isDisplayed();
  }

  public boolean isSeeAllUsersDisplayed(){
    return all_users.isDisplayed();
  }

  public boolean isIconUsersDisplayed(){
    return icon_users.isDisplayed();
  }

  public String getUsersArrowStatus(){
    String arrow_value = "";
    String arrow = users_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
  public String getProductsArrowStatus(){
    String arrow_value = "";
    String arrow = products_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
  public String getBudgetArrowStatus(){
    String arrow_value = "";
    String arrow = budget_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
  public String getHappynessArrowStatus(){
    String arrow_value = "";
    String arrow = happyness_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }

  public String getEnergyTargetArrowStatus(){
    String arrow_value = "";
    String arrow = energy_target_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
    public String getEnergyWeekArrowStatus(){
    String arrow_value = "";
    String arrow = energy_week_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
  public String getEnergyMonthArrowStatus(){
    String arrow_value = "";
    String arrow = energy_month_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
    public String getFunTargetArrowStatus(){
    String arrow_value = "";
    String arrow = fun_target_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
    public String getFunWeekArrowStatus(){
    String arrow_value = "";
    String arrow = fun_week_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }
    public String getFunMonthArrowStatus(){
    String arrow_value = "";
    String arrow = fun_month_arrow.getAttribute("data-testid");
    if (arrow.contains("Up")) arrow_value = "Up";
    else arrow_value = "Down";
    return arrow_value;
  }



  public String getUsersStaatusColor(){
    return users_color.getCssValue("color");
  }
  public String getProductsStatusColor(){
    return products_color.getCssValue("color");
  }

  public String getBudgetStatusColor(){
    return budget_color.getCssValue("color");
  }
  public String getHappynessStatusColor(){
    return happyness_color.getCssValue("color");
  }
  public String getEnergyTargetStatusColor(){
    return energy_target_color.getCssValue("color");
  }
  public String getEnergyWeektStatusColor(){
    return energy_week_color.getCssValue("color");
  }
  public String getEnergyMonthtStatusColor(){
    return energy_month_color.getCssValue("color");
  }
  public String getFunTargetStatusColor(){
    return fun_target_color.getCssValue("color");
  }
  public String getFunWeekStatusColor(){
    return fun_week_color.getCssValue("color");
  }
  public String getFunMonthStatusColor(){
    return fun_month_color.getCssValue("color");
  }


}

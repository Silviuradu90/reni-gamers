package com.reni.pom.pages;

import com.reni.pom.AbstractPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.scheduling.support.SimpleTriggerContext;

public class ProductsPage extends AbstractPage {

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table")
  private WebElement products_table;
  public boolean isProductsTableDisplayed(){
    return products_table.isDisplayed();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[2]")
  private WebElement food_column;
  public String getFoodColumnText(){
    return food_column.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[3]")
  private WebElement calories_column;
  public String getCaloriesColumnText(){
    return calories_column.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[4]")
  private WebElement protein_column;
  public String getProteinColumnText(){
    return protein_column.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[5]")
  private WebElement carbs_column;
  public String getCarbsColumnText(){
    return carbs_column.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/thead/tr/th[6]")
  private WebElement fat_column;
  public String getFatColumnText(){
    return fat_column.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[1]/td[1]/button")
  private WebElement click_arrow_blackberries;
  public void BlackberriesArrowClick(){
    click_arrow_blackberries.click();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/div")
  private WebElement history_text;
  public String getHistoryText(){
    return history_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/table/thead/tr/th[1]")
  private WebElement date_text;
  public String getDateText(){
    return date_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/table/thead/tr/th[2]")
  private WebElement customer_text;
  public String getCustomerText(){
    return customer_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/table/thead/tr/th[3]")
  private WebElement amount_text;
  public String getAmountText(){
    return amount_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/table/thead/tr/th[4]")
  private WebElement total_price_eur_text;
  public String getTotalPriceEurText(){
    return total_price_eur_text.getText();
  }

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div")
  private WebElement blackberries_expand;
  public boolean isBlackberriesExpandDisplayed(){
    return blackberries_expand.isDisplayed();
  }

  @FindBy (xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/table/tbody/tr[2]/td/div/div/div/div/table/tbody/tr[1]/td[1]")
  private WebElement customer_field1;
  public String getCustomerField1Text(){
    return customer_field1.getText();
  }


}

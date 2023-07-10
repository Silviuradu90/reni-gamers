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
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/p[3]")
  private  WebElement energy_level;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]")
  private  WebElement energy_target_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]")
  private  WebElement energy_week_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/p[2]")
  private  WebElement energy_percentage;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div")
  private  WebElement energy_target_percentage;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[2]/div[2]/div")
  private  WebElement energy_week_percentage;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[1]")
  private  WebElement energy_month_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[1]/div[2]/div[2]/div[3]/div[2]/div")
  private  WebElement energy_month_percentage;

  public boolean isEnergyChartDisplayed(){
    return energy_chart.isDisplayed();
  }

  public String getEnergyText(){
    return energy_text.getText();
  }
  public String getEnergyLevelStatsText(){
    return energy_level.getText();
  }


  public String getEnergyWeektText(){
    return energy_week_text.getText();
  }

  public boolean isEnergyPercentageDisplayed(){
    return energy_percentage.isDisplayed();
  }
  public String getEnergyTargetText(){
    return energy_target_text.getText();
  }
  public boolean isEnergyTargetPercentageDisplayed(){
    return energy_target_percentage.isDisplayed();
  }
  public boolean isEnergyWeekPercentageDisplayed(){
    return energy_week_percentage.isDisplayed();
  }
  public String getEnergyMonthText(){
    return energy_month_text.getText();
  }
  public boolean isEnergyMonthPercentageDisplayed(){
    return energy_month_percentage.isDisplayed();
  }
  public String getEergyText(){
    return energy_text.getText();
  }


  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]")
  private  WebElement having_fun;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[1]//*[contains(@data-test-id,'CircularProgressbar')]")
  private  WebElement having_fun_chart;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/p[1]")
  private  WebElement having_fun_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/p[3]")
  private  WebElement having_fun_level;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/p[2]")
  private  WebElement having_fun_percentage;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]")
  private  WebElement having_fun_target_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/div")
  private  WebElement having_fun_target_percentage;

  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[1]")
  private  WebElement having_fun_week_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div")
  private  WebElement having_fun_week_percentage;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/div[1]")
  private  WebElement having_fun_month_text;
  @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]/div")
  private  WebElement having_fun_month_percentage;

  public boolean isFunChartDisplayed(){
    return having_fun_chart.isDisplayed();
  }

  public String getHavingFunLevel(){
    return having_fun_level.getText();
  }
  public String getHavingFunText(){
    return having_fun_text.getText();
  }
  public boolean isHavingFunPercentageDisplayed(){
    return having_fun_percentage.isDisplayed();
  }
  public String getHavingFunTargetText(){
    return having_fun_target_text.getText();
  }
  public boolean isHavingFunTargetPercentageDisplayed(){
    return having_fun_target_percentage.isDisplayed();
  }
  public String getHavingFunWeekText(){
    return having_fun_week_text.getText();
  }
  public boolean isHavingFunWeekPercentageDisplayed(){
    return having_fun_week_percentage.isDisplayed();
  }
  public String getHavingFunMonthText(){
    return having_fun_month_text.getText();
  }
  public boolean isHavingFunMonthPercentageDisplayed(){
    return having_fun_week_percentage.isDisplayed();
  }
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

  public String getUsersStatusColor(){
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

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr")
  private  WebElement table_header;
  public boolean isTableHeaderDisplayed(){
    return table_header.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[1]")
  private  WebElement tracking_id;
  public boolean isTrackingIdDisplayed(){
    return tracking_id.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[2]")
  private  WebElement product;
  public boolean isProductDisplayed(){
    return product.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[3]")
  private  WebElement vendor;
  public boolean isVendorDisplayed(){
    return vendor.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[4]")
  private  WebElement date;
  public boolean isDaterDisplayed(){
    return date.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[5]")
  private  WebElement amount;
  public boolean isAmountrDisplayed(){
    return amount.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[6]")
  private  WebElement payment_method;
  public boolean isPaymentMethodDisplayed(){
    return payment_method.isDisplayed();
  }
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/thead/tr/th[7]")
  private  WebElement status;
  public boolean isStatusDisplayed(){
    return status.isDisplayed();
  }


  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[7]/span")
  private  WebElement status_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[7]/span")
  private  WebElement status_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[7]/span")
  private  WebElement status_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[7]/span")
  private  WebElement status_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[7]/span")
  private  WebElement status_field5;

  public String getTableStatusField1(){
    String field = "";
    String abc = status_field1.getAttribute("class");
    if (abc.contains("Approved")) field = "Approved";
    else  field= "Pending";
    return field;
  }
  public String getTableStatusField2(){
    String field = "";
    String abc = status_field2.getAttribute("class");
    if (abc.contains("Approved")) field = "Approved";
    else  field= "Pending";
    return field;
  }
  public String getTableStatusField3(){
    String field = "";
    String abc = status_field2.getAttribute("class");
    if (abc.contains("Approved")) field = "Approved";
    else  field= "Pending";
    return field;
  }
  public String getTableStatusField4(){
    String field = "";
    String abc = status_field4.getAttribute("class");
    if (abc.contains("Approved")) field = "Approved";
    else  field= "Pending";
    return field;
  }
  public String getTableStatusField5(){
    String field = "";
    String abc = status_field5.getAttribute("class");
    if (abc.contains("Approved")) field = "Approved";
    else  field= "Pending";
    return field;
  }
  public String getTableStatusColorField1(){
    return status_field1.getCssValue("color");
  }
  public String getTableStatusColorField2(){
    return status_field2.getCssValue("color");
  }
  public String getTableStatusColorField3(){
    return status_field3.getCssValue("color");
  }
  public String getTableStatusColorField4(){
    return status_field4.getCssValue("color");
  }
  public String getTableStatusColorField5(){
    return status_field5.getCssValue("color");
  }

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[6]")
  private  WebElement payment_method_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[6]")
  private  WebElement payment_method_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[6]")
  private  WebElement payment_method_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[6]")
  private  WebElement payment_method_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[6]")
  private  WebElement payment_method_field5;

  public String getTablePaymentMethodField1(){
    return payment_method_field1.getText();
  }
  public String getTablePaymentMethodField2(){
    return payment_method_field2.getText();
  }
  public String getTablePaymentMethodField3(){
    return payment_method_field3.getText();
  }
  public String getTablePaymentMethodField4(){
    return payment_method_field4.getText();
  }
  public String getTablePaymentMethodField5(){
    return payment_method_field5.getText();
  }

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[5]")
  private  WebElement amount_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[5]")
  private  WebElement amount_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[5]")
  private  WebElement amount_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[5]")
  private  WebElement amount_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[5]")
  private  WebElement amount_field5;

  public Integer getTableAmountField1(){
    return Integer.parseInt(amount_field1.getText());
  }
  public Integer getTableAmountField2(){
    return Integer.parseInt(amount_field2.getText());
  }
  public Integer getTableAmountField3(){
    return Integer.parseInt(amount_field3.getText());
  }
  public Integer getTableAmountField4(){
    return Integer.parseInt(amount_field1.getText());
  }
  public Integer getTableAmountField5(){
    return Integer.parseInt(amount_field5.getText());
  }

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[4]")
  private  WebElement date_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[4]")
  private  WebElement date_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[4]")
  private  WebElement date_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[4]")
  private  WebElement date_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[4]")
  private  WebElement date_field5;

  public String getTableDateField1(){
    return date_field1.getText();
  }
  public String getTableDateField2(){
    return date_field2.getText();
  }
  public String getTableDateField3(){
    return date_field3.getText();
  }
   public String getTableDateField4(){
    return date_field4.getText();
  }
   public String getTableDateField5(){
    return date_field5.getText();
  }

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]/div/img")
  private  WebElement icon_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/div/img")
  private  WebElement icon_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[2]/div/img")
  private  WebElement icon_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[2]/div/img")
  private  WebElement icon_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[2]/div/img")
  private  WebElement icon_field5;

  public boolean isTableProductIconField1Displayed() {
    return icon_field1.isDisplayed();
  }
  public boolean isTableProductIconField2Displayed() {
    return icon_field2.isDisplayed();
  }
  public boolean isTableProductIconField3Displayed() {
    return icon_field3.isDisplayed();
  }
  public boolean isTableProductIconField4Displayed() {
    return icon_field4.isDisplayed();
  }
  public boolean isTableProductIconField5Displayed() {
    return icon_field5.isDisplayed();
  }


  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]/div")
  private  WebElement name_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[2]/div")
  private  WebElement name_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[2]/div")
  private  WebElement name_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[2]/div")
  private  WebElement name_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[2]/div")
  private  WebElement name_field5;

  public String getTableProducNametField1(){
    return name_field1.getText();
  }
  public String getTableProducNametField2(){
    return name_field2.getText();
  }
  public String getTableProducNametField3(){
    return name_field3.getText();
  }
  public String getTableProducNametField4(){
    return name_field4.getText();
  }
  public String getTableProducNametField5(){
    return name_field5.getText();
  }

  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]")
  private  WebElement id_field1;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[2]/td[1]")
  private  WebElement id_field2;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[3]/td[1]")
  private  WebElement id_field3;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[4]/td[1]")
  private  WebElement id_field4;
  @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[2]/div[4]/div[2]/table/tbody/tr[5]/td[1]")
  private  WebElement id_field5;

  public String getTableIdField1Text(){
    return id_field1.getText();
  }
  public String getTableIdField2Text(){
    return id_field2.getText();
  }
  public String getTableIdField3Text(){
    return id_field3.getText();
  }
  public String getTableIdField4Text(){
    return id_field4.getText();
  }
  public String getTableIdField5Text(){
    return id_field5.getText();
  }
}

package com.reni.pom;

import static org.openqa.selenium.support.PageFactory.initElements;

import com.reni.core.context.ScenarioContext;
import com.reni.core.context.SpringContext;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {

  protected ScenarioContext scenarioContext;

  protected WebDriver driver;

  @SuppressWarnings("unchecked")
  public <T> T initOnDemand() {
    scenarioContext = SpringContext.getContext().getBean("Scenario Context", ScenarioContext.class);
    driver = scenarioContext.getDriver();
    initElements(driver, this);
    return (T) this;
  }

}

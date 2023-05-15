package com.reni.steps;

import com.reni.core.context.ScenarioContext;
import com.reni.core.context.SpringContext;
import com.reni.pom.Reni;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseStep {

  @Autowired
  protected Reni rf;

  protected ScenarioContext scenarioContext;

  protected WebDriver driver;

  public BaseStep() {
    scenarioContext = SpringContext.getContext().getBean("Scenario Context", ScenarioContext.class);
    driver = scenarioContext.getDriver();
  }

}

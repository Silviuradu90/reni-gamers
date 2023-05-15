package com.reni.hooks;

import com.reni.core.config.DriverConfig;
import com.reni.core.context.ScenarioContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@CucumberContextConfiguration

public class CoreHooks {

  private WebDriver driver;

  @Autowired
  ScenarioContext scenarioContext;

  @Before
  public void setup() {

    DriverConfig driverConfig = new DriverConfig();
    driver = driverConfig.createBrowser();
    driver.manage().window().maximize();
    scenarioContext.save("driver", driver);

  }

  @After
  public void tearDown() {
    driver.quit();
  }

}

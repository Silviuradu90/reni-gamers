package com.reni.core.config;

import com.reni.core.exceptions.ReniExceptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConfig {

  private String browser = "Chrome";

  public WebDriver createBrowser () {

    switch (browser.toUpperCase()) {

      case "Chrome" -> {

        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

      }
      case "Firefox" -> {

        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

      }
      case "Edge" -> {

        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();

      }

      default -> throw new ReniExceptions("This browser is not supported");
    }

  }

}

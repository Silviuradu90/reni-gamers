package com.reni.core.context;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component(value = "Scenario Context")
public class ScenarioContext {

  private final Map<String , Object> context = new HashMap<>();
  public void save(String key, Object value){

    context.put(key, value);

  }

  public Object get(String key){

    return context.get(key);

  }

  public WebDriver getDriver(){

    return (WebDriver) get("driver");

  }

}

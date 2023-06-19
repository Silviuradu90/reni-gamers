package com.reni;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    plugin = {"pretty", "json:target/cucumber-report/cucumber.json"},
    glue = {"com.reni.hooks", "com.reni.steps"},
    tags = "@Data"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {

}

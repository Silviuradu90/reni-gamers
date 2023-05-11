package com.reni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.reni;")
@EntityScan(basePackages = "com.reni;")

public class SpringBootApp {

  public static void main(String[] args) {

    SpringApplication.run(SpringBootApp.class, args);
  }
}
package com.reni.core.utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import java.time.Duration;
import java.util.concurrent.Callable;
import org.awaitility.Awaitility;

public class Await {

  public static void until(Callable<Boolean> command, Duration atMost) {
    Awaitility.await()
        .atLeast(Duration.ofMillis(500))
        .atMost(atMost)
        .pollInSameThread()
        .with()
        .pollInterval(Duration.ofMillis(500))
        .until(command);
  }

  public static void until(Callable<Boolean> command) {
    until(command, Duration.ofSeconds(10));
  }

  public static void until(Callable<Boolean> command, String possibleFail) {
    Awaitility.await()
        .atLeast(Duration.ofMillis(500))
        .atMost(Duration.ofSeconds(10))
        .pollInSameThread()
        .with()
        .alias(possibleFail)
        .pollInterval(Duration.ofMillis(500))
        .until(command);
  }

}

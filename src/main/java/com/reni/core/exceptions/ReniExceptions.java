package com.reni.core.exceptions;

public class ReniExceptions extends RuntimeException{

  public ReniExceptions(String message) {

    super(message);

  }

  public ReniExceptions(String message, Throwable cause) {

    super(message, cause);

  }

}
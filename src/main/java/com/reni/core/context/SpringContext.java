package com.reni.core.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {

  private static ApplicationContext context;

  public static <T> T getBean(String beanName, Class<T> beanClass) {
    return getContext().getBean(beanName, beanClass);
  }

  @Override
  public synchronized void setApplicationContext(ApplicationContext context) {

    SpringContext.context = context;
  }

  public static ApplicationContext getContext() {
    return context;
  }

}

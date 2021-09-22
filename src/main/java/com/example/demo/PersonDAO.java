package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

//@Repository
public class PersonDAO implements DAO, InitializingBean, DisposableBean {

  @Autowired
  private ApplicationContext context;

  @Override
  public void destroy() throws Exception {
    System.out.println("destruyendo el bean PersonDAO....");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println(context);
    System.out.println("despues de inyectar dependencias");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("pre destroy");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("postConstruct");
  }
}

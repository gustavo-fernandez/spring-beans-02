package com.prueba;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Repository01 implements Repository {

  @PostConstruct
  public void postConstruct() {
    System.out.println("rep 01");
  }

}

package com.prueba;

import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
public class Service {

  private Repository repository;

  @PostConstruct
  public void postConstruct() {
    System.out.println("service");
  }

}

package com.prueba;

import javax.annotation.PostConstruct;

public class Repository02 implements Repository {

  @PostConstruct
  public void postConstruct() {
    System.out.println("rep 02");
  }

}

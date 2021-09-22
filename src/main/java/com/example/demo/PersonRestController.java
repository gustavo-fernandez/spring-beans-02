package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonRestController {

  private PersonBusiness personBusiness;

  @Autowired
  public void setPersonBusiness(PersonBusiness personBusiness) {
    this.personBusiness = personBusiness;
  }

  @RequestMapping("hola")
  public Person getPerson() {
    return personBusiness.getPerson();
  }

}

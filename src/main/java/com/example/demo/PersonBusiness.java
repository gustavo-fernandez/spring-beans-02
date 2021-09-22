package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PersonBusiness {

  @Autowired
  @Qualifier("personDao2")
  public DAO dao;

  public Person getPerson() {
    System.out.println(dao);
    Person person = new Person();
    person.setFullName("Desde Business");
    person.setDni("12345678");
    return person;
  }

}

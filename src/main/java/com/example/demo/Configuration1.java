package com.example.demo;


import com.prueba.Repository;
import com.prueba.Repository01;
import com.prueba.Repository02;
import com.prueba.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {

  @Bean
  Service service(Repository repository) {
    new Repository01();
    new Repository02();
    return new Service(repository);
  }

  @Bean
  Repository repository() {
    return new Repository01();
  }

}

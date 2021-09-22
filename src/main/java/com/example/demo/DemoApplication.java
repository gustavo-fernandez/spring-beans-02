package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	// Managed bean
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		System.out.println(appContext);
		/*PersonRestController beanRestController = appContext.getBean(PersonRestController.class);
		PersonBusiness personBusinessBean = beanRestController.personBusiness;
		System.out.println("asignado al RestController: " + personBusinessBean);
		System.out.println("personDAO del objeto: " + personBusinessBean.personDAO);*/

		/*PersonBusiness personBusinessDelBeanContainer = appContext.getBean(PersonBusiness.class);
		System.out.println("Del container: " + personBusinessDelBeanContainer);
		System.out.println("DAO Del container: " + personBusinessDelBeanContainer.personDAO);*/

	}

}

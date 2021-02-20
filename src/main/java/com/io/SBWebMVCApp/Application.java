package com.io.SBWebMVCApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.io.SBWebMVCApp.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=
		SpringApplication.run(Application.class, args);
		
		UserService service = applicationContext.getBean(UserService.class);
		
		service.printUserName(101);
		
	}

}

package com.sood.vaibhav.aopExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sood.vaibhav.aopExample.business.Business1;
import com.sood.vaibhav.aopExample.business.Business2;

@SpringBootApplication
public class AopExampleApplication implements CommandLineRunner {

	Logger logger  = LoggerFactory.getLogger(AopExampleApplication.class);
	@Autowired
	Business1 business1;
	
	@Autowired
	Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(AopExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}

}

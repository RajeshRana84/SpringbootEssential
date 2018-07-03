package com.example.features.SpringbootFeatures;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootFeaturesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootFeaturesApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(SpringbootFeaturesApplication.class, args);
	
		// Print all beans names in application
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String name : beanNames) {
			System.out.println(name);
		}
	
		
		// Use --debug as program arguments to view the Auto Configuration Report
		// 1. Run as Configuration
		// 2. "--debug" as program Arguments
		// 3. Run the app to show AutoConfig eport on Console
	}
	
	

	
	
}

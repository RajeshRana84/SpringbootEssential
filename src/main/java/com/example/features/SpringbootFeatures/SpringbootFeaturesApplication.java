package com.example.features.SpringbootFeatures;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.example.features.SpringbootFeatures.ext.properties.AppProperties;
import com.example.features.SpringbootFeatures.ext.properties.ClientConfig;

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
	
		// Get specific bean
		ClientConfig cc = ctx.getBean(ClientConfig.class);
		System.out.println(cc.toString());
		cc.printEnvVariables();
		

		// Get specific bean
		AppProperties ap = ctx.getBean(AppProperties.class);
		System.out.println(ap.toString());
	}
	
	

	
	
}

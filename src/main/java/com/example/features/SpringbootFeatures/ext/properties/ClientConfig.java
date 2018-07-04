package com.example.features.SpringbootFeatures.ext.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
// Load specific props file. By Default it is "application.properties" if this annotation 
//is not provided.
@PropertySource("classpath:mysource.properties")
public class ClientConfig {
	@Value( "${client.name}" )
	private String clientName;
	@Value( "${client.stream}" )
	private String clientStream;
	@Value( "${client.age:Ten}" ) // Default value "Ten" when the property is not found
	private String clientAge;
	
	// Injecting Environment variables
	@Autowired
	private Environment env; 
	
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientStream() {
		return clientStream;
	}
	public void setClientStream(String clientStream) {
		this.clientStream = clientStream;
	}
	public String getClientAge() {
		return clientAge;
	}
	public void setClientAge(String clientAge) {
		this.clientAge = clientAge;
	}
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	@Override
	public String toString() {
		return "ClientConfig [clientName=" + clientName + ", clientStream=" + clientStream + ", clientAge=" + clientAge
				+ ", env=" + env + "]";
	}
	
	public void printEnvVariables() {
        System.out.println(env.getProperty("JAVA_HOME"));
        // Environment can be used to get the properties from the application.properties file as well
        System.out.println(env.getProperty("client.stream"));
	}
	
	
	
	

}

package com.example.StarterProject;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class StarterProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StarterProjectApplication.class, args);
		
		
		Object byName = context.getBean("farewell");
	    String byType = context.getBean(String.class);
	    String byBoth = context.getBean("farewell", String.class);

	    System.out.println(byName);
	    System.out.println(byType);
	    System.out.println(byBoth);
	    
	    System.out.println(context.getBean("greeting"));
	    System.out.println(context.getBean("farewell"));
	    
	    System.out.println(context.containsBean("time"));
		
		}

}

package com.rungroup.websiteexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteExampleApplication {

	public static void main(String[] args) {



		/*
		Here I learned that springboot removes the need for
		instantiating objects from another class
		 */

		SpringApplication.run(WebsiteExampleApplication.class, args);

	}

}


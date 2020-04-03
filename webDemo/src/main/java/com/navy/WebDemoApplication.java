package com.navy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.navy")
public class WebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
	}

}

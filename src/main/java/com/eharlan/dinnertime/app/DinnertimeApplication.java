package com.eharlan.dinnertime.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DinnertimeApplication {

	@RequestMapping("/")
	public String home() {
	  return "Hello from the API!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DinnertimeApplication.class, args);
	}

}

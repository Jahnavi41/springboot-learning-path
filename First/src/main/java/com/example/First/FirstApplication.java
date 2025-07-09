package com.example.First;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(FirstApplication.class, args);

		MyFirstService myFirstService = context.getBean(MyFirstService.class);
		System.out.println(myFirstService.myFirstService());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOs());
		System.out.println(myFirstService.readProperty());
	}

}

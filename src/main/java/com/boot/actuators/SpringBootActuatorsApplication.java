package com.boot.actuators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorsApplication.class, args);
		System.out.println("actuators running....");
	}

}

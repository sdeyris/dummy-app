package com.example.dummyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyAppApplication {

	public static void main(String[] args) {
		for (String arg : args)
			System.out.println(arg);
		SpringApplication.run(DummyAppApplication.class, args);
	}
}

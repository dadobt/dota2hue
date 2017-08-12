package com.example.dota2hue;

import com.example.dota2hue.service.Bridge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dota2parserApplication {

	@Autowired
	private Bridge bridge;

	public static void main(String[] args) {
		SpringApplication.run(Dota2parserApplication.class, args);
	}

}

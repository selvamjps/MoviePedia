package com.verizon.moviepedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("application-context.xml")
public class MoviePediaConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviePediaConsoleApplication.class, args);
	}
}

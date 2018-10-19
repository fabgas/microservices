package org.tutorial.commandes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CommandesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandesApplication.class, args);
	}
}

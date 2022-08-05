package com.example.wylserviceregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WylServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WylServiceRegisteryApplication.class, args);
	}

}

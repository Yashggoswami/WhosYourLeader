package com.example.wylapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WylApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WylApiGatewayApplication.class, args);
	}

}

package com.example.wylapigateway.routes;


import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;


public class resourceRoutes {
    @Bean
    RouterFunction staticResourceLocator(){
        return RouterFunctions.resources("/**", new ClassPathResource("static/"));
    }
}

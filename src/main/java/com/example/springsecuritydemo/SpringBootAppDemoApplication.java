package com.example.springsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SpringBootAppDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAppDemoApplication.class, args);
    }

}

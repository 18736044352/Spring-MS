package com.java.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MSProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSProviderApplication.class, args);
    }
}

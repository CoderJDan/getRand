package com.example.getrand_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetRandGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetRandGatewayApplication.class, args);
    }

}

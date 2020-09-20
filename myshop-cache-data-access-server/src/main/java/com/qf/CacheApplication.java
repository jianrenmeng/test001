package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CacheApplication {

    public static void main(String[] args) {
        System.out.println(SpringApplication.run(CacheApplication.class));
    }
}

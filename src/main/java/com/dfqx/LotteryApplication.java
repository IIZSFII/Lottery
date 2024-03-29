package com.dfqx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class LotteryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LotteryApplication.class,args);
    }
}


package com.itheima.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumeApplication.class,args);
    }
}

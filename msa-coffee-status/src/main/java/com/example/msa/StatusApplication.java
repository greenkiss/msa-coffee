package com.example.msa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableHystrix
@EnableEurekaClient
@EnableSwagger2
@SpringBootApplication
public class StatusApplication {
    public static void main(String[] args) {
        SpringApplication.run(StatusApplication.class, args);
    }
}

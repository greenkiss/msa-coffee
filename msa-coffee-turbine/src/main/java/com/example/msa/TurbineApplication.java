package com.example.msa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableEurekaClient
@SpringBootApplication
@EnableTurbine
public class TurbineApplication {
    public static void main(String[] args){
        SpringApplication.run(TurbineApplication.class, args);
    }
}

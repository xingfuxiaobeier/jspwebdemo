package com.dhb.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages="com.dhb.service")   //默认扫描是当前包下的路径
@EnableAutoConfiguration
public class ServiceApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceApplication.class, args);
    }

}


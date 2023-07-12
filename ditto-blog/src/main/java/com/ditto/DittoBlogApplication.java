package com.ditto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ditto.mapper")
@EnableScheduling
public class DittoBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(DittoBlogApplication.class,args);
    }
}

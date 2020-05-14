package com.seed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.seed.module.dal")
@SpringBootApplication
public class MyApplicationStarter {
    public static void main(String[] args) {
        SpringApplication.run(MyApplicationStarter.class, args);
    }
}

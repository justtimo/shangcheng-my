package com.wby.sc.scuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wby.sc.scuser.mapper")
public class ScUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScUserApplication.class, args);
    }

}

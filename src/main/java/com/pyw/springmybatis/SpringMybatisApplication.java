package com.pyw.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.pyw.springmybatis.mapper")
@SpringBootApplication
public class SpringMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMybatisApplication.class, args);
    }

}

package com.ezhang.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ezhang.product.mapper")
public class SeataProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataProductApplication.class, args);
    }

}

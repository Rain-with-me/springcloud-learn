package com.lu.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //开启服务发现功能
public class SpringCloudAlibabaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaProvider8001Application.class, args);
    }

}

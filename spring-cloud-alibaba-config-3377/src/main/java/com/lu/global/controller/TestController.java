package com.lu.global.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description: @RefreshScope 用于刷新配置,bootstrap.yml优先级高
 * @Author: 雨同我
 * @DateTime: 2022/9/29 20:26
*/

@RestController
@RefreshScope
public class TestController {
// 这里是获取nacos里面的配置，详情看他的配置管理
    @Value("${message}")
    private String message;
    @Value("${ext-one}")
    private String one;
    @Value("${ext-two}")
    private String two;

    @GetMapping("/message")
    public String getMessage() {
        return this.message;
    }

    @GetMapping("/more")
    public String getMore() {
        return this.one+"-------"+this.two;
    }
}
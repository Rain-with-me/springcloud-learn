package com.lu.sentinel.controller;

import com.lu.sentinel.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @Autowired
    private TestService testService;

    /**
     * @Description: 测试限流QBS
     * QPS（Queries-per-second，每秒钟的请求数量）：当调用该api的QPS达到阈值的时候，进行限流；
     * @Author: 雨同我
     * @DateTime: 2022/9/30 17:51
    */
    @GetMapping("test-qps")
    public String test() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
        return "test";
    }
    
    /** 
     * @Description: 测试关联
     * @Author: 雨同我
     * @DateTime: 2022/10/2 16:02
    */
    @GetMapping("link-1")
    public String link_1()  {
        return "link-1"+testService.chainPath();
    }
    @GetMapping("link-2")
    public String link_2()  {
        return "link-2"+testService.chainPath();
    }
}
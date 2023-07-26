package com.lu.test.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.lu.rpc.IActivityBooth;
import com.lu.rpc.req.ActivityReq;
import com.lu.rpc.res.ActivityRes;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 雨同我
 * @Description:
 * @DateTime: 2023/7/26 14:42
 **/

@RestController
public class TestController {

    @DubboReference
    private IActivityBooth activityBooth;

    @GetMapping("/t")
    public void test_rpc() {
        ActivityReq req = new ActivityReq();
        req.setActivityId(1L);
        ActivityRes result = activityBooth.queryActivityById(req);
        System.out.println(result);
    }
}

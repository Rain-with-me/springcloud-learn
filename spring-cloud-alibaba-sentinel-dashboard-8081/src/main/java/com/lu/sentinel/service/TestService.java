package com.lu.sentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @Author: 雨同我
 * @Description:
 * @DateTime: 2022/10/2 16:31
 **/
@Service
public class TestService {
    @SentinelResource("/chain-path")
    public String chainPath(){
        return "chain-path";
    }
}

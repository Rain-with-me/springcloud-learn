package com.ezhang.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 14:18
 * @Description:
 */

@FeignClient(contextId = "remoteAccountService", value = "seata-account")
public interface RemoteAccountService {

    @PostMapping(value = "/account/reduceBalance")
    Map<String, Object> reduceBalance(@RequestParam("userId") Long userId, @RequestParam("price") Double price);

}

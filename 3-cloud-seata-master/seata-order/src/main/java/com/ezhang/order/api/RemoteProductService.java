package com.ezhang.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 14:19
 * @Description:
 */
@FeignClient(contextId = "remoteProductService", value = "seata-product")
public interface RemoteProductService {

    @PostMapping(value = "/product/reduceStock")
    Map<String, Object> reduceStock(@RequestParam("productId") Long productId, @RequestParam("amount") Integer amount);

}

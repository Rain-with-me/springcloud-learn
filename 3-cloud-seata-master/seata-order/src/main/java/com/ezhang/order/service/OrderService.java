package com.ezhang.order.service;

import com.ezhang.order.dto.PlaceOrderRequest;
import io.seata.core.exception.TransactionException;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:19
 * @Description:
 */

public interface OrderService
{
    /**
     * 下单
     *
     * @param placeOrderRequest 订单请求参数
     */
    void placeOrder(PlaceOrderRequest placeOrderRequest) throws TransactionException;
}

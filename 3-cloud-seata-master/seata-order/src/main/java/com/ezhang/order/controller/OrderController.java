package com.ezhang.order.controller;

import com.ezhang.order.dto.PlaceOrderRequest;
import com.ezhang.order.service.OrderService;
import io.seata.core.exception.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:24
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/placeOrder")
    public String placeOrder(@Validated @RequestBody PlaceOrderRequest request) throws TransactionException {
        orderService.placeOrder(request);
        return "下单成功";
    }
}
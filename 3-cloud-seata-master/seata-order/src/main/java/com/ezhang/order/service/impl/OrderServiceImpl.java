package com.ezhang.order.service.impl;

import com.ezhang.order.api.RemoteAccountService;
import com.ezhang.order.api.RemoteProductService;
import com.ezhang.order.dto.PlaceOrderRequest;
import com.ezhang.order.entity.Order;
import com.ezhang.order.mapper.OrderMapper;
import com.ezhang.order.service.OrderService;
import io.seata.core.context.RootContext;
import io.seata.core.exception.TransactionException;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.tm.api.GlobalTransactionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:22
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Resource
    private OrderMapper orderMapper;

    @Autowired
    private RemoteAccountService accountService;

    @Autowired
    private RemoteProductService productService;

    @Override
//    @Transactional
    @GlobalTransactional(rollbackFor = Exception.class)
    public void placeOrder(PlaceOrderRequest request) throws TransactionException {
        log.info("=============ORDER START=================");
        Long userId = request.getUserId();
        Long productId = request.getProductId();
        Integer amount = request.getAmount();
        log.info("收到下单请求,用户:{}, 商品:{},数量:{}", userId, productId, amount);
        log.info("当前 XID: {}", RootContext.getXID());

        Order order = new Order(userId, productId, 0, amount);
        orderMapper.insert(order);


        int i=10/0;

        log.info("订单一阶段生成，等待扣库存付款中");
        // 扣减库存并计算总价
        Map<String, Object> reduceStockMap = productService.reduceStock(productId, amount);
        Double totalPrice = Double.valueOf(reduceStockMap.get("totalPrice").toString());

        // 扣减余额
        Map<String, Object> map = accountService.reduceBalance(userId, totalPrice);
        order.setStatus(1);
        order.setTotalPrice(totalPrice);
        orderMapper.updateById(order);
        log.info("订单已成功下单");
        log.info("=============ORDER END=================");

    }

}

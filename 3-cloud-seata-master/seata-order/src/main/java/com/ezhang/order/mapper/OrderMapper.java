package com.ezhang.order.mapper;

import com.ezhang.order.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:18
 * @Description:
 */

@Repository
public interface OrderMapper
{
    void insert(Order order);

    void updateById(Order order);
}
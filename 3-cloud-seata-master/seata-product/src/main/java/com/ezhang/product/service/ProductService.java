package com.ezhang.product.service;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:20
 * @Description:
 */

public interface ProductService
{
    /**
     * 扣减库存
     *
     * @param productId 商品 ID
     * @param amount 扣减数量
     * @return 商品总价
     */
    Double reduceStock(Long productId, Integer amount);
}

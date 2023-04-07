package com.ezhang.product.mapper;

import com.ezhang.product.entity.Product;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:18
 * @Description:
 */
public interface ProductMapper
{
    public Product selectById(Long productId);

    public void updateById(Product product);
}

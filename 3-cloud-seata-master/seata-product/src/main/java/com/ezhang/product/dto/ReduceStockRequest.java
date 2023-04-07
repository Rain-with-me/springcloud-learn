package com.ezhang.product.dto;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:46
 * @Description:
 */
public class ReduceStockRequest
{
    private Long productId;

    private Integer amount;

    public Long getProductId()
    {
        return productId;
    }

    public void setProductId(Long productId)
    {
        this.productId = productId;
    }

    public Integer getAmount()
    {
        return amount;
    }

    public void setAmount(Integer amount)
    {
        this.amount = amount;
    }
}

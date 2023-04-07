package com.ezhang.account.dto;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:46
 * @Description:
 */
public class ReduceBalanceRequest
{
    private Long userId;

    private Integer price;

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }
}

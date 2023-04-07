package com.ezhang.account.service;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:19
 * @Description:
 */
public interface AccountService
{
    /**
     * 账户扣减
     * @param userId 用户 ID
     * @param price 扣减金额
     */
    void reduceBalance(Long userId, Double price);
}

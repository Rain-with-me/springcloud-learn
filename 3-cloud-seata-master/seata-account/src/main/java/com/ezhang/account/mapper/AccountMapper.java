package com.ezhang.account.mapper;

import com.ezhang.account.entity.Account;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 9:17
 * @Description:
 */
public interface AccountMapper
{
    Account selectById(Long userId);

    void updateById(Account account);
}
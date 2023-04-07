package com.ezhang.account.controller;

import com.ezhang.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 14:09
 * @Description:
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/reduceBalance")
    public Map<String, Object> reduceBalance(Long userId, Double price){
        accountService.reduceBalance(userId, price);
        Map<String, Object> map = new HashMap<>();
        map.put("code","success");
        return map;
    }

}

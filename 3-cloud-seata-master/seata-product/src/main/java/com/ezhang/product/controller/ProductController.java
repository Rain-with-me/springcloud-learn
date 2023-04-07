package com.ezhang.product.controller;

import com.ezhang.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ezhang
 * @Date: Created in 2022/2/10 14:12
 * @Description:
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/reduceStock")
    public Map<String, Object> reduceStock(Long productId, Integer amount) throws InterruptedException {
//        Thread.sleep(10000);
        Double totalPrice = productService.reduceStock(productId, amount);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "success");
        map.put("totalPrice", totalPrice);
        return map;
    }

}

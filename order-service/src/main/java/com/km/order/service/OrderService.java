package com.km.order.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {


    public String makeOrder(Long productId, Integer stockCount) {
        System.out.println("下订单成功");
        return "userName:"+productId+":"+"";
    }
}

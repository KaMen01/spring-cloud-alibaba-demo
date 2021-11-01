package com.km.order.controller;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.km.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author coming | 2021/10/29 20:24
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("makeOrder/{productId}/{stockCount}")
    public String makeOrder(@PathVariable("productId") Long productId,
                            @PathVariable("stockCount") Integer stockCount){
//        return
        return orderService.makeOrder(productId,stockCount);
    }
}

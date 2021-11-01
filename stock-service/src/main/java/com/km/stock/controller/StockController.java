package com.km.stock.controller;

import com.km.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author coming | 2021/10/29 20:27
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    @Autowired
    private Registration registration;

    /**减少库存
     *
     * @param productId 商品id
     * @param stockCount 减少的量
     * @return 消息
     */
    @GetMapping("/deduct/{productId}/{stockCount}")
    public String deductStock(@PathVariable("productId") Long productId,
                              @PathVariable("stockCount") Integer stockCount){
        return stockService.deductStock(productId,stockCount);
    }

    @GetMapping("/getIpAndPort")
    public String getIpAndPort(){
        return registration.getHost()+":"+registration.getPort();
    }

}

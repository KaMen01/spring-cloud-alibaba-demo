package com.km.stock.service;

import org.springframework.stereotype.Service;

/**
 * @author coming | 2021/10/29 20:28
 */
@Service
public class StockService {

    public String deductStock(Long productId, Integer stockCount) {
        System.out.println(productId+":减少"+stockCount);
        return "商品库存减少成功";
    }
}

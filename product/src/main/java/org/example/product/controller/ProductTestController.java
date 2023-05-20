package org.example.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductTestController {

    @GetMapping("/product/{productId}")
    public String orderDetail(@PathVariable Integer productId) {

        return "商品【" + productId + "】详情";

    }

}

package org.example.order.controller;

import org.example.common.entity.Product;
import org.example.order.feign.ProductFeignService;
import org.example.order.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private ProductFeignService productFeignService;

    @GetMapping("/order/{orderId}")
    public OrderVO orderDetail(@PathVariable Long orderId) {

        List<Product> products = new ArrayList<>();
        products.add(productFeignService.getDetail(1000002));
        products.add(productFeignService.getDetail(1000003));

        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(orderId);
        orderVO.setProducts(products);

        return orderVO;

    }

}

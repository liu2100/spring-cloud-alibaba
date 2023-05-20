package org.example.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderTestController {

    @GetMapping("/order/{orderId}")
    public String orderDetail(@PathVariable Long orderId) {

        return "订单ID：" + orderId;

    }

}

package org.example.order.controller;

import cn.hutool.core.util.RandomUtil;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.example.common.Result;
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
    @SentinelResource(value = "order-detail", blockHandler = "orderDetailBlockHandler")
    public Result<OrderVO> orderDetail(@PathVariable Long orderId) {

        //List<Product> products = new ArrayList<>();
        //products.add(productFeignService.getDetail(RandomUtil.randomInt(10000000, 20000000)));
        //products.add(productFeignService.getDetail(RandomUtil.randomInt(10000000, 20000000)));

        OrderVO orderVO = new OrderVO();
        orderVO.setOrderId(orderId);
        //orderVO.setProducts(products);

        return Result.success(orderVO);

    }

    public Result<OrderVO> orderDetailBlockHandler(@PathVariable Long orderId, BlockException blockException) {
        System.out.println(blockException.getRule());
        return Result.error(-100, "系统限流");
    }

}

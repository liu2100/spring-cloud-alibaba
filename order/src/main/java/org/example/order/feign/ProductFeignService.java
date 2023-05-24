package org.example.order.feign;

import org.example.common.entity.Product;
import org.example.common.feignapi.ProductApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductFeignService {

    @GetMapping("/product/{productId}")
    Product getDetail(@PathVariable("productId") Integer productId);

}

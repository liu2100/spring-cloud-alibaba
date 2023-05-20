package org.example.common.feignapi;

import org.example.common.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductApi {

    @GetMapping("/product/{productId}")
    Product getDetail(@PathVariable("productId") Integer productId);

}

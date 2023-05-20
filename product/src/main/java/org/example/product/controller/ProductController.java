package org.example.product.controller;

import org.example.common.entity.Product;
import org.example.common.feignapi.ProductApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController implements ProductApi {

    public Product getDetail(@PathVariable Integer productId) {

        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("商品名称：" + productId);

        return product;

    }

}

package org.example.order.vo;

import lombok.Data;
import org.example.common.entity.Product;

import java.util.List;

@Data
public class OrderVO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品列表
     */
    private List<Product> products;

}

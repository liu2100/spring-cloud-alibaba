package org.example.order.vo;

import lombok.Data;

@Data
public class OrderVO {

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 商品ID
     */
    private Integer productId;

    /**
     * 商品名称
     */
    private String productName;


}

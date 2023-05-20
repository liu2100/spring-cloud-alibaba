package org.example.order.feign;

import org.example.common.feignapi.ProductApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "product-service")
public interface ProductFeignService extends ProductApi {

}

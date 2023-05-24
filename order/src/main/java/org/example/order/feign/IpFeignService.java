package org.example.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liudaojian
 * Date: 2023/5/24 18:01
 * Description:
 */
@FeignClient(name = "feign", url = "http://httpbin.org")
public interface IpFeignService {

    @GetMapping("/ip")
    String getIp();

}

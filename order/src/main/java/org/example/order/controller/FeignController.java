package org.example.order.controller;

import org.example.common.Result;
import org.example.order.feign.IpFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liudaojian
 * Date: 2023/5/24 17:59
 * Description:
 */
@RestController
public class FeignController {

    @Autowired
    private IpFeignService ipFeignService;

    @GetMapping("/feign")
    public Result<?> index() {

        //http://httpbin.org/ip  获取第三方ip信息
        System.out.println(ipFeignService.getIp());
        return Result.success();

    }

}

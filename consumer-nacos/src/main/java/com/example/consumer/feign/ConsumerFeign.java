package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@FeignClient("provider-nacos")
public interface ConsumerFeign {

    /**
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    String hello(@RequestParam("name")String name);
}

package com.example.consumer.controller;

import com.example.consumer.feign.ConsumerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerFeign consumerFeign;


    @RequestMapping("/hello")
    public String hello(String name){
        return consumerFeign.hello(name);
    }
}

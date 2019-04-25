package com.example.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@RestController
public class ProviderController {


    @RequestMapping("/hello")
    public String hello(String name, HttpServletRequest request){
        return "hello:"+name+"port:"+request.getServerPort();
    }
}


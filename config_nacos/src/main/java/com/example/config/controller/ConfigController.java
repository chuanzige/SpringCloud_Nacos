package com.example.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@RestController
@RefreshScope
public class ConfigController {

    @Value("${nacos.config}")
    private String config;

    @RequestMapping("/read")
    public String readConfig(){
        return config;
    }

}

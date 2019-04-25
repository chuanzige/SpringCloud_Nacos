package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderNacosApplication.class, args);
    }

}

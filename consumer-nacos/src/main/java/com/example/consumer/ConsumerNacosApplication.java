package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author MrWang
 * @version v1.0
 * @date 2019-04-25
 * @Description
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerNacosApplication.class, args);
    }

}

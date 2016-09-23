package com.peachyy.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by xsTao on 2016/9/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Application {
    @Value("${config.name}")
    String name = "World";
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @RequestMapping("/")
    public String home() {
        return "Hello " + name;
    }
}

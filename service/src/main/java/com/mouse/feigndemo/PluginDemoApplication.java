package com.mouse.feigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.mouse" })
//@EnableNacosDiscovery
@EnableFeignClients(basePackages = {"com.mouse" })
public class PluginDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginDemoApplication.class, args);
    }

}

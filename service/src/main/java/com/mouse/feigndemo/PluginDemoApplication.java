package com.mouse.feigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mouse" })
//@EnableNacosDiscovery
public class PluginDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginDemoApplication.class, args);
    }

}

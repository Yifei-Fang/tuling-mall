package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//1、可以获取服务信息
//2、用于向consul或者zookeeper作为注册中心的时候提供注册服务（就是提供注册服务的，不需要过多演示）
public class TulingmallAuthcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TulingmallAuthcenterApplication.class, args);
    }

}

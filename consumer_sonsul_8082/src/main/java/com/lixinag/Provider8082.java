package com.lixinag;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author guoqiang3@lixiang.com
 * @version 1.0
 * @date 2022/1/30 11:14
 */
@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8082 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8082.class, args);
    }
}

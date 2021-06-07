package com.xinrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerPeer3V0Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerPeer3V0Application.class, args);
    }

}

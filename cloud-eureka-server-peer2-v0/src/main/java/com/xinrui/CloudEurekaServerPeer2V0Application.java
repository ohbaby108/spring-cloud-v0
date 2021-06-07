package com.xinrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServerPeer2V0Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServerPeer2V0Application.class, args);
    }

}

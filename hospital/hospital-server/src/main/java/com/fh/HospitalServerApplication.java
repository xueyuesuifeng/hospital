package com.fh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HospitalServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalServerApplication.class, args);
    }

}

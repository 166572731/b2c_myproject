package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoshowApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoshowApplication.class, args);
    }

}

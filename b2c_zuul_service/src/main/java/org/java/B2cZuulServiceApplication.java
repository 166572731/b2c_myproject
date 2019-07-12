package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class B2cZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2cZuulServiceApplication.class, args);
    }

}

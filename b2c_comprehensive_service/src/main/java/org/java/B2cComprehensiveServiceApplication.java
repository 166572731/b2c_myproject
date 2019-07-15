package org.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@MapperScan("org.java.mapper")
public class B2cComprehensiveServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2cComprehensiveServiceApplication.class, args);
    }

}

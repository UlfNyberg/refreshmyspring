package com.example.refreshmyspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RefreshMySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefreshMySpringApplication.class, args);
    }

}

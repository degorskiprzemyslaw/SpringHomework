package com.sda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sda.model", "com.sda.service","com.sda.repository"})
public class ZadanieDomowe1Application {

    public static void main(String[] args) {
        SpringApplication.run(ZadanieDomowe1Application.class, args);
    }

}

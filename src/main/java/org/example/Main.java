package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(scanBasePackages = "com.example.demo.dao")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
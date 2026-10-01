package com.example.farmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FarmerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmerApplication.class, args);
    }

    @GetMapping("/api/health")
    public String health() {
        return "Farmer Management Application is running!";
    }
}

package com.example.gradleinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.*")
public class GradleInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradleInitApplication.class, args);
    }

}

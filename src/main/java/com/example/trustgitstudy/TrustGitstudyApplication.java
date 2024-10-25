package com.example.trustgitstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TrustGitstudyApplication {

    public static void main(String[] args) {
        log.info("Hello git");
        SpringApplication.run(TrustGitstudyApplication.class, args);
    }
}

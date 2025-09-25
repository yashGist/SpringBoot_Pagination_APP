package com.springbootpaginationapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.springbootpaginationapp", "com.pagination"})
@EnableJpaRepositories(basePackages = "com.pagination.repository")
@EntityScan(basePackages = "com.pagination.entity")
public class SpringBootPaginationAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootPaginationAppApplication.class, args);
    }

}

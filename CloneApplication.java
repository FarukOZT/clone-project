package com.product.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.product.clone.repository")
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.product.clone.*")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloneApplication.class, args);
    }

}

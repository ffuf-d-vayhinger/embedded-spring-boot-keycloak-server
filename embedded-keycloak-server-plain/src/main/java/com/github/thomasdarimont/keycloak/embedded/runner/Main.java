package com.github.thomasdarimont.keycloak.embedded.runner;

import org.keycloak.common.Profile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class Main {

    public static void main(String[] args) {
        Profile.defaults();
        SpringApplication.run(Main.class, args);
    }

}

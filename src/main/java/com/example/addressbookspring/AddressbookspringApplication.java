package com.example.addressbookspring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressbookspringApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(AddressbookspringApplication.class, args);
        log.info("AddressBook App Started in {} Environment",context.getEnvironment().getProperty("environment"));
        log.info("AddressBook DB user is {} ",context.getEnvironment().getProperty("spring.datasource.username"));
    }

}

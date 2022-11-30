package com.jm.ebean.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;

@SpringBootApplication(scanBasePackages = "com.jm.ebean")
@EntityScan(basePackages = "com.jm.ebean.model")
public class EbeanApplication {

    public static void main(String[] args) {

        SpringApplication.run(EbeanApplication.class, args);

    }




}

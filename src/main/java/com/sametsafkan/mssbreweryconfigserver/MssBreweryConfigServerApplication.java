package com.sametsafkan.mssbreweryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MssBreweryConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MssBreweryConfigServerApplication.class, args);
    }

}

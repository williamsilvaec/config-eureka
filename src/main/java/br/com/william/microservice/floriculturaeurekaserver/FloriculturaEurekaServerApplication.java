package br.com.william.microservice.floriculturaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FloriculturaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FloriculturaEurekaServerApplication.class, args);
    }

}



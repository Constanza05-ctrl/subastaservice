package com.proyectosemestral.subasta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients; // <- Importante

@SpringBootApplication
@EnableFeignClients // <- Esta anotación activa Feign en el proyecto
public class SubastaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubastaApplication.class, args);
    }
}
package com.proyectosemestral.subasta.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservicio-tienda", url = "http://localhost:8081/api/tiendas")
public interface TiendaClient {
    @GetMapping("/{id}")
    boolean verificarTiendaExiste(@PathVariable("id") Long id);
}
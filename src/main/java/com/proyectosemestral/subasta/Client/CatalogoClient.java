package com.proyectosemestral.subasta.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservicio-catalogo", url = "http://localhost:8083/api/productos")
public interface CatalogoClient {
    @GetMapping("/{id}")
    boolean verificarProductoEnCatalogo(@PathVariable("id") Long id);
}
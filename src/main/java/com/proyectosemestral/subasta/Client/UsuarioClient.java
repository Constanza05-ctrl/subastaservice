package com.proyectosemestral.subasta.Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservicio-usuarios", url = "http://localhost:8082/api/usuarios")
public interface UsuarioClient {
    @GetMapping("/{id}")
    boolean verificarUsuarioActivo(@PathVariable("id") Long id);
}
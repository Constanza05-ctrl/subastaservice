package com.proyectosemestral.subasta.Controller;

import com.proyectosemestral.subasta.Service.SubastaService;
import com.proyectosemestral.subasta.Dto.SubastaDTO;

import jakarta.validation.Valid; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/subastas")
public class SubastaController {

    private static final Logger log = LoggerFactory.getLogger(SubastaController.class);

    @Autowired
    private SubastaService subastaService;

    @PostMapping
    public ResponseEntity<?> crearSubasta(@Valid @RequestBody SubastaDTO subastaDTO) {
        log.info("Recibida solicitud para crear una subasta");
        
        subastaService.guardarSubasta(subastaDTO);
        
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Subasta creada con éxito tras verificar microservicios");
        
        return new ResponseEntity<>(respuesta, HttpStatus.CREATED);
    }
}
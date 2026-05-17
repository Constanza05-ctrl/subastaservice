package com.proyectosemestral.subasta.Service;

import com.proyectosemestral.subasta.Client.CatalogoClient;
import com.proyectosemestral.subasta.Dto.SubastaDTO;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubastaService {

    @Autowired
    private CatalogoClient catalogoClient;

    public boolean guardarSubasta(SubastaDTO subastaDTO) {
        try {
            Boolean existeProducto = catalogoClient.verificarProductoEnCatalogo(subastaDTO.getProductoId());
            
            if (existeProducto == null || !existeProducto) {
                throw new RuntimeException("El producto con ID " + subastaDTO.getProductoId() + " no existe en el catálogo.");
            }
        } catch (FeignException e) {
            throw new RuntimeException("Error al comunicarse con el catálogo: El servicio externo parece estar caído.");
        }

        return true;
    }
}
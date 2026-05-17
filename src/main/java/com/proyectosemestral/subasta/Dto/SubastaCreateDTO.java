package com.proyectosemestral.subasta.Dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class SubastaCreateDTO {
    @NotNull(message = "El ID del producto del catálogo es obligatorio")
    private Long idProducto;

    @NotNull(message = "El ID del usuario es obligatorio")
    private Long idUsuario;

    @NotNull(message = "El ID de la tienda es obligatorio")
    private Long idTienda;

    @NotNull(message = "El precio inicial es obligatorio")
    @Positive(message = "El precio inicial debe ser un número positivo")
    private Double precioInicial;

    public Long getIdProducto() { return idProducto; }
    public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
    public Long getIdTienda() { return idTienda; }
    public void setIdTienda(Long idTienda) { this.idTienda = idTienda; }
    public Double getPrecioInicial() { return precioInicial; }
    public void setPrecioInicial(Double precioInicial) { this.precioInicial = precioInicial; }
}
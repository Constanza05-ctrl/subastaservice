package com.proyectosemestral.subasta.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

public class SubastaDTO {

    @NotBlank
    private String titulo;

    @NotBlank
    private String descripcion;

    @NotNull
    @Positive
    private Double precioInicial;

    @NotNull
    private Long productoId;

    @NotNull
    private Long usuarioId;

    private LocalDateTime fechaFin;

    public SubastaDTO() {
    }

    public SubastaDTO(String titulo, String descripcion, Double precioInicial, Long productoId, Long usuarioId, LocalDateTime fechaFin) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precioInicial = precioInicial;
        this.productoId = productoId;
        this.usuarioId = usuarioId;
        this.fechaFin = fechaFin;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(Double precioInicial) {
        this.precioInicial = precioInicial;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }
}
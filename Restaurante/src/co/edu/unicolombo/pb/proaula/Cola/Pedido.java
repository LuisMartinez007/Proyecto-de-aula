/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.Cola;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


/**
 *
 * @author CRISTIAN
 */
public class Pedido {
   private UUID id;
    private String cliente;
    private BigDecimal total;
    private String estado;
    private LocalDateTime fechaCreacion;
    
    public Pedido() {
        this.id = UUID.randomUUID();
        this.fechaCreacion = LocalDateTime.now();
        this.estado = "Pendiente";
    }
    
    public Pedido(String cliente, BigDecimal total) {
        this();
        this.cliente = cliente;
        this.total = total;
    }
    
     public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", cliente=" + cliente + ", total=" + total + ", estado=" + estado
                + ", fechaCreacion=" + fechaCreacion + "]";
    }
}

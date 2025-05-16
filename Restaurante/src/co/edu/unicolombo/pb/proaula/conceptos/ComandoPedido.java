/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import co.edu.unicolombo.pb.proaula.Constants.EstadoVentaEnum;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ComandoPedido {
    private String id;
    private Cliente cliente;
    private List<ItemVenta> items;
    private Date fechaCreacion;
    private EstadoVentaEnum estado;

    public void enviarACocina() {
        this.estado = EstadoVentaEnum.PENDIENTE;
    }

    public void actualizarEstado(EstadoVentaEnum nuevoEstado) {
        this.estado = nuevoEstado;
    }
    
    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public EstadoVentaEnum getEstado() {
        return estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setEstado(EstadoVentaEnum estado) {
        this.estado = estado;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.QueryModel;

import co.edu.unicolombo.pb.proaula.Constants.EstadoPedido;
import co.edu.unicolombo.pb.proaula.conceptos.ComandoPedido;
import co.edu.unicolombo.pb.proaula.conceptos.ItemPedido;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ConsultaPedido {
    private String id;
    private String nombreCliente;
    private List<ItemPedido> items;
    private EstadoPedido estado;
    private Date fechaCreacion;
    private float totalPedido;

    public static ConsultaPedido fromComandoPedido(ComandoPedido pedido) {
        ConsultaPedido consulta = new ConsultaPedido();
        consulta.setId(pedido.getId());
        consulta.setNombreCliente(pedido.getCliente().getNombre());
        consulta.setEstado(pedido.getEstado());
        return consulta;
    }

    public void actualizarEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setTotalPedido(float totalPedido) {
        this.totalPedido = totalPedido;
    }

    public String getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public float getTotalPedido() {
        return totalPedido;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import co.edu.unicolombo.pb.proaula.Constants.EstadoVentaEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Usuario
 */
public class Venta {

    private static AtomicInteger serial = new AtomicInteger(1);
    // USuario cajero;
    private Integer id;
    private Cliente cliente;
    private Date fecha;
//    public HashMap<String, ItemVenta> itemsVenta;
    private List<ItemVenta> itemsVenta;
    private EstadoVentaEnum estado;

    public Venta(Cliente cliente) {
        this.id = serial.getAndIncrement();
        this.cliente = cliente;
        this.fecha = new Date();
        itemsVenta = new ArrayList<>();
    }

  

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<ItemVenta> getItemsVenta() {
        return itemsVenta;
    }

    public void agregarItem(ItemVenta item) {
        itemsVenta.add(item);
    }

    public Integer getId() {
        return id;
    }

    public ItemVenta buscarItemPorId(Integer id) throws Exception {
        var respuesta = itemsVenta.stream()
                .filter(i -> i.id.equals(id)).findFirst();
        if (respuesta.isEmpty()) {
            throw new RuntimeException("El Item de producto no existe: " + id);
        }
        return respuesta.get();
    }

   public List<ItemVenta>  buscarItemPorProductoId(Integer productoId) throws Exception {
         var items = itemsVenta.stream()
                .filter(i -> i.producto.id.equals(productoId)).toList();
        if (items.isEmpty()) {
            throw new RuntimeException("No esisten item para el producto: "+productoId);
        }
        return items;
    }
    
     public List<ItemVenta> buscarItemPorNombreProducto(String productoNombre) throws Exception {
        var items = itemsVenta.stream()
                .filter(i -> i.producto.nombre.contains(productoNombre)).toList();
        if (items.isEmpty()) {
            throw new RuntimeException("No esisten item para el producto: "+productoNombre);
        }
        return items;
    }

    public void editarItem(ItemVenta item) throws Exception {
       var itemEncontrado = buscarItemPorId(item.id);
       itemEncontrado.cantidad = item.cantidad;
       itemEncontrado.id = item.id;
       itemEncontrado.producto = item.producto;
       itemEncontrado.venta = item.venta;

    }
    
    //public List<ItemPedido> getItems(){
      //  return new ArrayList<>(venta.itemsVenta.values());
    //}
    
    public EstadoVentaEnum getEstado() {
        return estado;
    }

    public void setEstado(EstadoVentaEnum estado) {
        this.estado = estado;
    }
    

    public float calcularTotalGeneral() {

        float totalGeneral = 0;
        for (var item : itemsVenta) {
            totalGeneral += item.calcularSubtotal();
        }
        return totalGeneral;
    }
}

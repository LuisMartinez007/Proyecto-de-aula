 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.crud;

import co.edu.unicolombo.pb.proaula.conceptos.Cliente;
import co.edu.unicolombo.pb.proaula.conceptos.ItemPedido;
import co.edu.unicolombo.pb.proaula.conceptos.Venta;
import java.util.List;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author yulin
 */
public class GestionVentas {

    Venta venta;
    
    public GestionVentas() {
        venta = new Venta();
        venta.itemsVenta = new HashMap<>();
        venta.fecha = new Date();
    }

    public void agregarItem(ItemPedido item) {
        venta.itemsVenta.put(item.producto.nombre, item);
    }

    public ItemPedido buscarItem(String nombreProducto) throws Exception {
        if (!venta.itemsVenta.containsKey(nombreProducto)) {
            throw new Exception("El producto no existe en este venta");
        }
        return venta.itemsVenta.get(nombreProducto);
    }

    public void quitarItem(String nombreProducto) throws Exception {
        if (!venta.itemsVenta.containsKey(nombreProducto)) {
            throw new Exception("El producto no existe en este venta");
        }
        venta.itemsVenta.remove(nombreProducto);
    }

    public void editarItem(ItemPedido item) throws Exception {
        if (!venta.itemsVenta.containsKey(item.producto.nombre)) {
            throw new Exception("El producto no existe en este venta");
        }
        venta.itemsVenta.remove(item.producto.nombre);
    }

    public Venta getVenta() {
        return venta;
    }
    
    public List<ItemPedido> getItems(){
        return new ArrayList<>(venta.itemsVenta.values());
    }
    
    public void setCliente(Cliente cliente){
        venta.cliente = cliente;
    }

    public float calcularTotalGeneral(){
        var items = getItems();
        float totalGeneral = 0;
        for (ItemPedido item : items) {
           totalGeneral += item.subtotal;
        }
        return totalGeneral;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author yulin
 */
public class ItemVenta {
    public static AtomicInteger serial = new AtomicInteger(1);
    public Producto producto;
    public float cantidad;
    public Integer id;
    public Venta venta;

    public ItemVenta() {
    }

    public ItemVenta(Venta venta, Producto producto, float cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.cantidad = cantidad;
        this.venta = venta;
        this.id = serial.getAndDecrement();
    }

    public float calcularSubtotal(){
        var impuesto = producto.precio * cantidad;
        return  producto.precio * cantidad;
    }
    
}

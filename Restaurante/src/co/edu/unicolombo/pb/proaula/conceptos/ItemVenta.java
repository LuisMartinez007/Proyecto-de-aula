/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

/**
 *
 * @author yulin
 */
public class ItemVenta {
    public Producto producto;
    public float candidad;
    public Venta venta;
    public float subtotal;
    
    public void calcularSubtotal(){
        subtotal = producto.precio * candidad;
    };
}

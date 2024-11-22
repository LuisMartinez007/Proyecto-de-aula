/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

/**
 *
 * @author yulin
 */
public class ItemPedido {
    public Producto producto;
    public float cantidad;
    public float subtotal;
    public String candidad;
    
    public void calcularSubtotal(){
        subtotal = producto.precio * cantidad;
    };
}

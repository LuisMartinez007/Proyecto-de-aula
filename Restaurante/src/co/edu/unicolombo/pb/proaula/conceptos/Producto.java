/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Usuario
 */
public class Producto {
    private static AtomicInteger serial = new AtomicInteger(1);
    public  String nombre;
    public  String[] ingredientes;
    public  float precio=0;
    public  Integer id;

    public Producto(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.id = serial.getAndDecrement();
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.id = serial.getAndDecrement();
    }

  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    public  String nombre;
    public  String documento;
    
    public Cliente(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }
    
}

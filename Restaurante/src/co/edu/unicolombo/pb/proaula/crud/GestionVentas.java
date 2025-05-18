 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.crud;

import co.edu.unicolombo.pb.proaula.Constants.EstadoVentaEnum;
import co.edu.unicolombo.pb.proaula.conceptos.Venta;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author yulin
 */
public class GestionVentas {

    private static Queue<Venta> ventas;

    
    public GestionVentas() {
        if(ventas == null){
            ventas = new LinkedList<>();
        }
    }

    public void agregar(Venta venta){
        var existe = ventas.stream()
                .anyMatch(v -> v.getId().equals(venta.getId()));
        if (existe) {
            throw new RuntimeException("La venta ya existe:"+ venta.getId());
        }
        ventas.offer(venta);
    }

    public Venta buscarPorId(Integer id){
         var respuesta = ventas.stream()
                .filter(v -> v.getId().equals(id)).findFirst();
        if (respuesta.isEmpty()) {
            throw new RuntimeException("La venta no existe:"+ id);
        }
        return respuesta.get();
    }
    
     public Venta primeraEnCola(){
         
        return ventas.peek();
    }
     
    public Venta finalizarVenta(){
        primeraEnCola().setEstado(EstadoVentaEnum.ENTREGADO);
        return ventas.poll();
    }

    public Queue<Venta> getVentas() {
        return ventas;
    }

    public List<Venta> recorrerCola() {
    if (ventas.isEmpty()) {
        return new ArrayList<>();
    }
    
    List<Venta> listaVentas = new ArrayList<>(ventas);
    
    return listaVentas;
    }
}

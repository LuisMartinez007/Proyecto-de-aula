/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.Cola;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author CRISTIAN
 */
public class ColaPedidos {
    private Queue<Pedido> cola;
    
    
    public ColaPedidos() {
        this.cola = new LinkedList<>();
    }
    
    
    public void agregarPedido(Pedido pedido) {
        cola.offer(pedido);
    }
    
    
    public Pedido obtenerSiguientePedido() {
        return cola.poll();
    }
    
    public Pedido verSiguientePedido() {
        return cola.peek();
    }
    
    public int cantidadPedidos() {
        return cola.size();
    }
    
    public boolean estaVacia() {
        return cola.isEmpty();
    }
    
    public List<Pedido> obtenerTodosPedidos() {
        return new ArrayList<>(cola);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.repositorios;

import co.edu.unicolombo.pb.proaula.Constants.EstadoPedido;
import co.edu.unicolombo.pb.proaula.conceptos.ComandoPedido;

/**
 *
 * @author Usuario
 */
public interface ComandoPedidoRepositorio {
    void guardar(ComandoPedido pedido);
    void actualizarEstado(String pedidoId, EstadoPedido estado);
}

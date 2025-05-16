/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.conceptos;

import co.edu.unicolombo.pb.proaula.Constants.EstadoVentaEnum;
import co.edu.unicolombo.pb.proaula.QueryModel.ConsultaPedido;
import co.edu.unicolombo.pb.proaula.repositorios.ComandoPedidoRepositorio;
import co.edu.unicolombo.pb.proaula.repositorios.ConsultaPedidoRepositorio;

/**
 *
 * @author Usuario
 */
public class ServicioPedidos {
    private ComandoPedidoRepositorio comandoRepositorio;
    private ConsultaPedidoRepositorio consultaRepositorio;

    public void crearPedido(ComandoPedido pedido) {
        comandoRepositorio.guardar(pedido);
        
        // Crear modelo de consulta
        ConsultaPedido consultaPedido = ConsultaPedido.fromComandoPedido(pedido);
        pedido.enviarACocina();
    }

    public void actualizarEstadoPedido(String pedidoId, EstadoVentaEnum nuevoEstado) {
        ComandoPedido pedido = new ComandoPedido();
        pedido.actualizarEstado(nuevoEstado);
        comandoRepositorio.actualizarEstado(pedidoId, nuevoEstado);

        ConsultaPedido consultaPedido = consultaRepositorio.obtenerPorId(pedidoId);
        consultaPedido.actualizarEstado(nuevoEstado);
    }

    public ConsultaPedido consultarEstadoPedido(String pedidoId) {
        return consultaRepositorio.obtenerPorId(pedidoId);
    }
}

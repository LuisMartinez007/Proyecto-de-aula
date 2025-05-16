  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.repositorios;

import co.edu.unicolombo.pb.proaula.Constants.EstadoVentaEnum;
import co.edu.unicolombo.pb.proaula.QueryModel.ConsultaPedido;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ConsultaPedidoRepositorio {
    ConsultaPedido obtenerPorId(String pedidoId);
    List<ConsultaPedido> obtenerPedidosPorEstado(EstadoVentaEnum estado);
}

package co.edu.unicolombo.pb.proaula.views;

import co.edu.unicolombo.pb.proaula.conceptos.Cliente;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class VentanaListarClientes extends JFrame {
    public VentanaListarClientes(List<Cliente> clientes) {
        setTitle("Lista de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

      
        String[] columnas = {"Documento", "Nombre"};
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tablaClientes = new JTable(modeloTabla);

       
        for (Cliente cliente : clientes) {
            modeloTabla.addRow(new Object[]{cliente.documento, cliente.nombre});
        }

      
        JScrollPane scrollPane = new JScrollPane(tablaClientes);
        add(scrollPane, BorderLayout.CENTER);
    }
}

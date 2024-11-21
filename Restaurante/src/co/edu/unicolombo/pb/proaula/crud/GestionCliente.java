/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.crud;

import co.edu.unicolombo.pb.proaula.conceptos.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class GestionCliente {
    private List<Cliente> clientes;
    private static final String ARCHIVO_CLIENTES = "C:\\Users\\Usuario\\Desktop\\Proyecto-de-aula\\Restaurante\\src\\co\\edu\\unicolombo\\pb\\proaula\\clientes.txt";
    
    public GestionCliente(){
        clientes = new ArrayList<>();
        cargarClientes();
    }
    
    public Cliente buscarCliente(String documento) {
        for(Cliente cliente : clientes){
            if(cliente.documento.equals(documento)){
                return cliente;
            }
        }
        return null;
    }
    
    public boolean eliminarCliente(String documento) {
        Cliente cliente = buscarCliente(documento);
        if(cliente != null) {
            clientes.remove(cliente);
            guardarEnArchivo();
            JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
        return false;
    }
    
    public void guardarCliente(Cliente cliente){
        if(buscarCliente(cliente.documento) == null){
            clientes.add(cliente);
            guardarEnArchivo();
            JOptionPane.showMessageDialog(null,"Usuario guardado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese documento");
        }
    }
    
    public List<Cliente> listarClientes(){
        return new ArrayList<>(clientes);
    }
    
    public boolean actualizarCliente(String documento, String nuevoNombre) {
        Cliente cliente = buscarCliente(documento);
        if(cliente != null){
            cliente.nombre = nuevoNombre;
            guardarEnArchivo();
            JOptionPane.showMessageDialog(null,"Usuario actualizado exitosamente");
            return true;
        }
        JOptionPane.showMessageDialog(null,"Usuario no encontrado");
        return false;
    }
    
    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(ARCHIVO_CLIENTES))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al guardar clientes: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    private void cargarClientes() {
        File archivo = new File(ARCHIVO_CLIENTES);
        if (archivo.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(ARCHIVO_CLIENTES))) {
                clientes = (List<Cliente>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al cargar clientes: " + e.getMessage());
                clientes = new ArrayList<>();
            }
        }
    }
}

package co.edu.unicolombo.pb.proaula.crud;

import co.edu.unicolombo.pb.proaula.conceptos.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestionProducto {
    private List<Producto> listaProductos;

    public GestionProducto() {
        listaProductos = new ArrayList<>();
    }

    // Crear un nuevo producto
    public void agregarProducto(String nombre, String[] ingredientes, float precio) {
        Producto nuevoProducto = new Producto();
        nuevoProducto.nombre = nombre;
        nuevoProducto.ingredientes = ingredientes;
        nuevoProducto.precio = precio;
        listaProductos.add(nuevoProducto);
    }

    // Leer todos los productos
    public List<Producto> listarProductos() {
        return listaProductos;
    }

    // Actualizar un producto existente
    public boolean actualizarProducto(String nombre, String nuevoNombre, String[] nuevosIngredientes, float nuevoPrecio) {
        for (Producto producto : listaProductos) {
            if (producto.nombre.equals(nombre)) {
                producto.nombre = nuevoNombre;
                producto.ingredientes = nuevosIngredientes;
                producto.precio = nuevoPrecio;
                return true; // Actualización exitosa
            }
        }
        return false; // Producto no encontrado
    }

    // Eliminar un producto
    public boolean eliminarProducto(String nombre) {
        return listaProductos.removeIf(producto -> producto.nombre.equals(nombre));
    }
}

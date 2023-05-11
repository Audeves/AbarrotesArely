/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;
import java.util.Optional;

import DAOs.ProductoDAO;
import Entidades.Producto;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Desktop
 */
public class ProductoService {

    private final ProductoDAO productoDAO;

    public ProductoService() {
        productoDAO = new ProductoDAO();
    }

    public void agregarProducto(Producto producto) {
        try {
            productoDAO.agregar(producto);
            JOptionPane.showMessageDialog(null, "Se agrego un nuevo producto", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el producto", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void eliminarProducto(Producto producto) {       
        try {
            productoDAO.eliminar(producto);
            JOptionPane.showMessageDialog(null, "Se eliminó el producto exitosamente", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el producto", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void actualizarProducto(Producto producto) {
        try {
            productoDAO.actualizar(producto);
            JOptionPane.showMessageDialog(null, "Se actualizo el producto exitosamente", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el producto", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public Producto buscarProductoPorId(Integer id) {       
        try {
            return productoDAO.buscarPorId(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el producto por ID", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    public List<Producto> buscarPorNombre(String nombre) {
        try {
            return productoDAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar los productos por nombre", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    public List<Producto> mostrarTodosLosProductos() {
        try {
            return productoDAO.mostrarTodas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener todas las categorías", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }
}

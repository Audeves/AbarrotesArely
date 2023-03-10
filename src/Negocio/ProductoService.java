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
        productoDAO.agregar(producto);
    }

    public void eliminarProducto(Producto producto) {
        productoDAO.eliminar(producto);
    }

    public void actualizarProducto(Producto producto) {
        productoDAO.actualizar(producto);
    }

    public Producto buscarProductoPorId(Integer id) {
        return productoDAO.buscarPorId(id);
    }

    public List<Producto> mostrarTodosLosProductos() {
        return productoDAO.mostrarTodas();
    }
}

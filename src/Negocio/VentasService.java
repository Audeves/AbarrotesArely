/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.util.List;
import java.util.Optional;

import DAOs.RelProductoVentaDAO;
import Entidades.RelProductosVentas;
/**
 *
 * @author Desktop
 */
public class VentasService {
    private RelProductoVentaDAO relProductoVentaDAO;

    public VentasService() {
        relProductoVentaDAO = new RelProductoVentaDAO();
    }
    
    public void agregarProductoVenta(RelProductosVentas productoVenta) {
        relProductoVentaDAO.agregar(productoVenta);
    }
    
    public void eliminarProductoVenta(RelProductosVentas productoVenta) {
        relProductoVentaDAO.eliminar(productoVenta);
    }
    
    public void actualizarProductoVenta(RelProductosVentas productoVenta) {
        relProductoVentaDAO.actualizar(productoVenta);
    }
    
    public RelProductosVentas buscarProductoVentaPorId(Integer id) {
        return relProductoVentaDAO.buscarPorId(id);
    }
    
    public List<RelProductosVentas> mostrarTodasLasVentas() {
        return relProductoVentaDAO.mostrarTodas();
    }
}

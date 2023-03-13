/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;
import java.util.List;
import java.util.Optional;

import DAOs.VentaDAO;
import Entidades.Venta;
/**
 *
 * @author Desktop
 */
public class VentaService {
    private VentaDAO ventaDAO;

    public VentaService() {
        this.ventaDAO = new VentaDAO();
    }

    public void agregarVenta(Venta venta) {
        ventaDAO.agregar(venta);
    }

    public void eliminarVenta(Venta venta) {
        ventaDAO.eliminar(venta);
    }

    public void actualizarVenta(Venta venta) {
        ventaDAO.actualizar(venta);
    }

    public Venta buscarVentaPorId(Integer id) {
        return ventaDAO.buscarPorId(id);
    }

    public List<Venta> mostrarTodasLasVentas() {
        return ventaDAO.mostrarTodas();
    }
}

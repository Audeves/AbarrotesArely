/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;
import Entidades.Producto;
import DAOs.VentaDAO;
import Entidades.RelProductosVentas;
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
    
    public float calcularVenta(int cantidad, float precio){
        return cantidad * precio;
    }
    
    public float calcularCambio(float total, float importe){
        return importe - total;
    }
    public void agregarVenta(Venta venta) {
        Producto producto = new Producto();
        RelProductosVentas rpv = new RelProductosVentas();
        float precioUnitario = producto.getPrecioActual();
        int cantidad = rpv.getCantidadVendida();
        float totalVenta = this.calcularVenta(cantidad, precioUnitario);
        venta.setTotal(totalVenta);
        

        
//        float importe = rpv.getSubtotal();
//        float cambio = this.calcularCambio(totalVenta, importe);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import DAOs.ProductoDAO;
import DAOs.RelProductoVentaDAO;
import Entidades.Encargado;
import Entidades.Persona;
import Entidades.Producto;
import Entidades.RelProductosVentas;
import Entidades.Venta;
import Negocio.PersonaService;
import Negocio.ProductoService;
import Negocio.VentaService;
import Negocio.VentasService;
import UI.Menu;
import UI.RegistroProducto;
import UI.RegistroVenta;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author david
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu menu = new Menu();
        menu.show();
//        RegistroVenta rV = new RegistroVenta();
//        rV.show();
//          RegistroProducto rP = new RegistroProducto();
//          rP.show();
//        Date date = new GregorianCalendar(Calendar.YEAR, Calendar.MARCH, Calendar.DAY_OF_MONTH).getTime();
//        ProductoService productoService = new ProductoService();
//      
//        Producto producto = new Producto("Nito", 17, 10, "92 gr");
//        productoService.agregarProducto(producto);
//        
//        ArrayList<Encargado> listaEncargados = new ArrayList<Encargado>();
////        //Aqui creamos la persona
//        Persona persona = new Persona("Jose Hernandez", "Obregon", "CIUOUEBF783R", "Calle 200", "Sochiloa", "545345334");
//        PersonaService personaService = new PersonaService();
////        personaService.agregarPersona(persona);
//        Encargado encargado = new Encargado("JFKDND", persona);
//        listaEncargados.add(encargado);
//        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("AbarrotesArelyPU");
//        EntityManager em = managerFactory.createEntityManager();
//        try {
//            em.getTransaction().begin();
//            Persona personaBuscada = em.find(Persona.class, 1);
//            Producto productoBuscado = em.find(Producto.class, 1);
//            Encargado encargadoBuscado = em.find(Encargado.class, 1);
////            Venta ventaBuscada = em.find(Venta.class, 1);
////            Venta venta = new Venta((float) 90.00, date, encargadoBuscado);
////            RelProductosVentas relProductosVentas = new RelProductosVentas(10, 10, 10,productoBuscado, ventaBuscada);
//            encargado.setPersonaidPersona(personaBuscada);
//            em.persist(encargado);
//
////             em.persist(venta);
//            em.getTransaction().commit();
//            JOptionPane.showMessageDialog(null, "El REGISTRO se agregó correctamente.", "Información", INFORMATION_MESSAGE);
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            JOptionPane.showMessageDialog(null, "Error al agregar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
//        } finally {
//            em.close();
//        }
//        Persona person = new Persona();
//        person.setCalle("Calle Miguelles");
//        person.setCiudad("Obregón");
//        person.setColonia("Hidalgo");
//        person.setCurp("CETSGDEC34243");
//        person.setNombre("Jose");
//        person.setTelefono("6544252322");
//
//        Encargado leader = new Encargado();
//        leader.setRfc("88DBIEDE3");
//        leader.setPersonaidPersona(person);
//
//        Venta venta = new Venta();
//        venta.setEncargado(leader);
//
//        venta.setTotal((float) 33.33);
//        venta.setFecha(date);
//
//        RelProductosVentas relProductosVentas = new RelProductosVentas();
//        relProductosVentas.setProducto(producto);
//        relProductosVentas.setVenta(venta);
//        relProductosVentas.setPrecioVenta(20);
//        relProductosVentas.setCantidadVendida(1);
//        relProductosVentas.setSubtotal(100);
//        venSer.agregarVenta(venta);
//         VentasService relprod = new VentasService();
//        VentasService vs = new VentasService();
//        VentaService venSer = new VentaService();
//        RelProductosVentas relProdVen = new RelProductosVentas();
//        relProdVen.setIdrelProductosVentas(1);
//        relProdVen.setCantidadVendida(2);
//        relProdVen.setPrecioVenta((float) 15.00);
//        relProdVen.setSubtotal((float) 30.00);
//        relProdVen.setProductoIdproducto(producto);
//        relProdVen.setVentaIdventa(venta);
//        vs.agregarProductoVenta(relProdVen);
//        relprod.agregarProductoVenta(relProdVen);
//        ps.agregarProducto(producto);
    }
    
}

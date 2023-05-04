/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/**
 *
 * @author Desktop
 */
public class ProductoDAO extends BaseDAO<Producto> {

    @Override
    public void agregar(Producto entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El producto se agregó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al agregar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(Producto entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            entidad = em.merge(entidad);
            em.remove(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El producto se eliminó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al eliminar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void actualizar(Producto producto) {
//        EntityManager em = this.getEntityManager();
//
//        Producto productoX = em.find(Producto.class, producto.getId());
//        if (productoX != null) {
//            productoX.setStock(producto.getStock());
//            em.persist(productoX);
//        } else {
//            throw new IllegalArgumentException("El producto no existe");
//        }
//        em.getTransaction().commit();
//        System.out.println("El producto se actualizó ");

        EntityManager em = this.getEntityManager();
        try {
            if (producto != null) {
                em.getTransaction().begin();
                em.merge(producto);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }

        System.out.println("El producto se actualizó ");
    }

    @Override
    public Producto buscarPorId(Integer id) {
        EntityManager em = this.getEntityManager();
        em.getTransaction().begin();
        em.getTransaction().commit();
        return em.find(Producto.class, id);
    }

    @Override
    public List<Producto> mostrarTodas() {
        EntityManager em = this.getEntityManager();

        Query consulta = em.createQuery("SELECT P FROM Producto p ");
        em.getTransaction().begin();

        List<Producto> productos = consulta.getResultList();

        for (Producto productos1 : productos) {
            System.out.println(productos1);
        }
        em.getTransaction().commit();
        return new ArrayList<>(productos);
    }

    public ArrayList<Producto> buscarPorNombre(String nombre) {
        EntityManager em = this.getEntityManager();
        TypedQuery<Producto> query;
        if (!nombre.equals("")) {
            query = em.createQuery("SELECT p FROM Producto p WHERE p.nombreProducto LIKE CONCAT('%', :nombre, '%')", Producto.class);
            query.setParameter("nombre", nombre);
        } else {
            query = em.createQuery("SELECT p FROM Producto p", Producto.class);
        }
        List<Producto> productos = query.getResultList();
        productos.forEach(em::refresh); // Forzar la actualización desde la base de datos
        return new ArrayList<>(productos);
    }

}

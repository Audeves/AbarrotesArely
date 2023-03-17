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
public class ProductoDAO extends BaseDAO<Producto>{

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
    public void actualizar(Producto entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El producto se actualizó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public Producto buscarPorId(Integer id) {
        EntityManager em = getEntityManager();
        Producto producto = null;
        try {
            producto = em.find(Producto.class, id);
        } finally {
            em.close();
        }
        return producto;
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
        em.getTransaction().begin();
        List<Producto> productos;
        if (!nombre.equals("")) {
            String jpql = String.format("SELECT * FROM sistemapuntoventa.producto WHERE sistemapuntoventa.producto.nombreProducto LIKE '%%"+nombre+"%%'");
            productos = em.createNativeQuery(jpql, Producto.class).getResultList();
        } else {
            String jpql = "SELECT * FROM sistemapuntoventa.producto;";
            productos = em.createNativeQuery(jpql, Producto.class).getResultList();
        }
        em.getTransaction().commit();

        return new ArrayList<>(productos);
    }
    
}

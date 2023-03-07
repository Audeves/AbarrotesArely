/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import Entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
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
        EntityManager em = getEntityManager();
        List<Producto> productos = null;
        try {
            TypedQuery<Producto> consulta = em.createQuery("SELECT p FROM Producto p", Producto.class);
            productos = consulta.getResultList();
        } finally {
            em.close();
        }
        return productos;
    }
    
}

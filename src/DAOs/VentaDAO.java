/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import Entidades.Venta;
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
public class VentaDAO extends BaseDAO<Venta> {

    @Override
    public void agregar(Venta entidad) {
        EntityManager em = this.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Venta agregada correctamente", "Agregado", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la venta", "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(Venta entidad) {
        EntityManager em = this.getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(entidad));
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Venta eliminada correctamente", "Eliminado", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la venta", "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void actualizar(Venta entidad) {
        EntityManager em = this.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Venta actualizada correctamente", "Actualizado", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la venta", "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public Venta buscarPorId(Integer id) {
        EntityManager em = this.getEntityManager();
        Venta venta = null;
        try {
            venta = em.find(Venta.class, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la venta por ID", "Error", ERROR_MESSAGE);
        } finally {
            em.close();
            return venta;
        }
    }

    @Override
    public List<Venta> mostrarTodas() {
         EntityManager em = this.getEntityManager();
        List<Venta> ventas = null;
        try {
            TypedQuery<Venta> query = em.createQuery("SELECT v FROM Venta v", Venta.class);
            ventas = query.getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar todas las ventas", "Error", ERROR_MESSAGE);
        } finally {
            em.close();
            return ventas;
        }
    }
    
}

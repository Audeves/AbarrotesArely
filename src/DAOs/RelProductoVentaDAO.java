/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;
import Entidades.RelProductosVentas;
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
public class RelProductoVentaDAO extends BaseDAO<RelProductosVentas>{
    
    public RelProductoVentaDAO() {
        super();
    }
    
    @Override
    public void agregar(RelProductosVentas entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El registro ha sido agregado correctamente", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el registro:\n" + e.getMessage(), "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(RelProductosVentas entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.merge(entidad));
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El registro ha sido eliminado correctamente", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el registro:\n" + e.getMessage(), "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public void actualizar(RelProductosVentas entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El registro ha sido actualizado correctamente", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el registro:\n" + e.getMessage(), "Error", ERROR_MESSAGE);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    @Override
    public RelProductosVentas buscarPorId(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RelProductosVentas.class, id);
        } finally {
            em.close();
        }
    }

    @Override
    public List<RelProductosVentas> mostrarTodas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<RelProductosVentas> query = em.createNamedQuery("RelProductosVentas.findAll", RelProductosVentas.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entidades.Encargado;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class EncargadoDAO extends BaseDAO<Encargado>{

    @Override
    public void agregar(Encargado entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El encargado se agregó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al agregar el encargado: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(Encargado entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            entidad = em.merge(entidad);
            em.remove(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El encargado se eliminó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al eliminar el encargado: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void actualizar(Encargado entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "El encargado se actualizó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al actualizar el encargado: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public Encargado buscarPorId(Integer id) {
        EntityManager em = getEntityManager();
        Encargado encargado = null;
        try {
            encargado = em.find(Encargado.class, id);
        } finally {
            em.close();
        }
        return encargado;
    }
        

    @Override
    public List<Encargado> mostrarTodas() {
        EntityManager em = getEntityManager();
        List<Encargado> encargados = null;
        try {
            TypedQuery<Encargado> consulta = em.createQuery("SELECT e FROM Encargado e", Encargado.class);
            encargados = consulta.getResultList();
        } finally {
            em.close();
        }
        return encargados;
    }

    public ArrayList<Encargado> buscarPorNombreUsuario(String nombreUsuario) {
        EntityManager em = this.getEntityManager();
        TypedQuery<Encargado> query;
        if (!nombreUsuario.equals("")) {
            query = em.createQuery("SELECT e FROM Encargado e WHERE e.usuario LIKE CONCAT('%', :nombreUsuario, '%')", Encargado.class);
            query.setParameter("nombreUsuario", nombreUsuario);
        } else {
            query = em.createQuery("SELECT e FROM Encargado e", Encargado.class);
        }
        List<Encargado> encargados = query.getResultList();
        encargados.forEach(em::refresh); // Forzar la actualización desde la base de datos
        return new ArrayList<>(encargados);
    }
    
}
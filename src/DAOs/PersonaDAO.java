/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOs;

import Entidades.Persona;
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
public class PersonaDAO extends BaseDAO<Persona>{

    @Override
    public void agregar(Persona entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "La persona se agregó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al agregar la persona: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(Persona entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            entidad = em.merge(entidad);
            em.remove(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "La persona se eliminó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al eliminar la persona: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public void actualizar(Persona entidad) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(entidad);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "La persona se actualizó correctamente.", "Información", INFORMATION_MESSAGE);
        } catch (Exception e) {
            em.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, "Error al actualizar la persona: " + e.getMessage(), "Error", ERROR_MESSAGE);
        } finally {
            em.close();
        }
    }

    @Override
    public Persona buscarPorId(Integer id) {
        EntityManager em = getEntityManager();
        Persona persona = null;
        try {
            persona = em.find(Persona.class, id);
        } finally {
            em.close();
        }
        return persona;
    }

    @Override
    public List<Persona> mostrarTodas() {
        EntityManager em = getEntityManager();
        List<Persona> personas = null;
        try {
            TypedQuery<Persona> consulta = em.createQuery("SELECT p FROM Persona p", Persona.class);
            personas = consulta.getResultList();
        } finally {
            em.close();
        }
        return personas;
    }

   
    
    
}
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
        try {
            EntityManager entityManager = this.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(entidad);
            entityManager.getTransaction().commit();

            // JOptionPane.showMessageDialog(null, "Se agrego nuevo producto", "Aviso", INFORMATION_MESSAGE);
            System.out.println("Se agrego");
        } catch (Exception e) {
            //   JOptionPane.showMessageDialog(null, "No se pudo agregar el producto", "Aviso", ERROR_MESSAGE);
            System.out.println("No se agrego");
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(Producto entidad) {
        try {
            EntityManager entityManager = this.getEntityManager();
            entityManager.getTransaction().begin();

            Producto producto = buscarPorId(entidad.getId());
            if (producto != null) {
                producto.setExistencia(false);
                entityManager.merge(producto);
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se pudo quitar el producto");
        }
    }
    
    public void continuar(Producto entidad) {
        try {
            EntityManager entityManager = this.getEntityManager();
            entityManager.getTransaction().begin();

            Producto producto = buscarPorId(entidad.getId());
            if (producto != null) {
                producto.setExistencia(true);
                entityManager.merge(producto);
            }
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Producto entidad) {
        try {
            EntityManager entityManager = this.getEntityManager();
            entityManager.getTransaction().begin();
            Producto productoActualizado = entityManager.find(Producto.class, entidad.getId());
            if (productoActualizado != null) {
                productoActualizado.setNombreProducto(entidad.getNombreProducto());
                productoActualizado.setPrecioActual(entidad.getPrecioActual());

                entityManager.merge(productoActualizado);
                System.out.println("Se ha actualizado con exito");
            } else {
                //  JOptionPane.showMessageDialog(null, "No se encontro el producto", "Aviso", INFORMATION_MESSAGE);
                System.out.println("No se pudo actualizar");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(null, "Huvo un error", "Aviso", ERROR_MESSAGE);
            System.out.println("No se pudo actualizar");
        }
    }

    @Override
    public Producto buscarPorId(Integer id) {
        String jpq = "SELECT p FROM Producto p WHERE p.Id = :id"; // Utiliza p.Id en lugar de u.id
        EntityManager entityManager = this.getEntityManager();
        TypedQuery<Producto> query = entityManager.createQuery(jpq, Producto.class);
        query.setParameter("id", id);
        List<Producto> productos = query.getResultList();

        if (productos.isEmpty()) {
            System.out.println("No se pudo encontrar el producto");
            return null;
        } else {
            return productos.get(0);
        }
    }

    @Override
    public List<Producto> mostrarTodas() {
        String jpq = "SELECT u FROM Producto u";
        EntityManager entityManager = this.getEntityManager();
        TypedQuery<Producto> query = entityManager.createQuery(jpq, Producto.class);
        List<Producto> productos = query.getResultList();
        if (productos.isEmpty()) {
            return null;
        } else {
            return productos;
        }

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

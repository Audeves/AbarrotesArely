/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAOs.CategoriaDAO;
import Entidades.Categoria;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class CategoriaService {
    private CategoriaDAO categoriaDAO;

    public CategoriaService() {
        categoriaDAO = new CategoriaDAO();
    }

    public void agregarCategoria(Categoria categoria) {
        try {
            categoriaDAO.agregar(categoria);
            JOptionPane.showMessageDialog(null, "Se agrego una nueva Categora", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la categoria", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void eliminarCategoria(Categoria categoria) {
        try {
            categoriaDAO.eliminar(categoria);
            JOptionPane.showMessageDialog(null, "Se eliminó la categoría exitosamente", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la categoría.");
            JOptionPane.showMessageDialog(null, "No se pudo eliminar la categoría", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void actualizarCategoria(Categoria categoria) {
        try {
            categoriaDAO.actualizar(categoria);
            JOptionPane.showMessageDialog(null, "Se actualizó la categoría exitosamente", "Aviso", INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar la categoría", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public Categoria buscarCategoriaPorId(Integer id) {
        try {
            return categoriaDAO.buscarPorId(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar la categoría por ID", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    public List<Categoria> mostrarTodasCategorias() {
        try {
            return categoriaDAO.mostrarTodas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener todas las categorías", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    public List<Categoria> buscarCategoriasPorNombre(String nombre) {
        try {
            return categoriaDAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar categorías por nombre", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }
}

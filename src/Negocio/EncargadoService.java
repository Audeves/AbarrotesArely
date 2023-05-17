/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAOs.EncargadoDAO;
import Entidades.Encargado;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Desktop
 */
public class EncargadoService {

    private final EncargadoDAO encargadoDAO;

    public EncargadoService() {
        encargadoDAO = new EncargadoDAO();
    }

    public void agregarEncargado(Encargado encargado) {
        encargadoDAO.agregar(encargado);
    }

    public void eliminarEncargado(Encargado encargado) {
        if (encargado == null) {
            throw new IllegalArgumentException("El encargado a eliminar no puede ser nulo.");
        }
        encargadoDAO.eliminar(encargado);
    }

    public void actualizarEncargado(Encargado encargado) {
        encargadoDAO.actualizar(encargado);
    }

    public Encargado buscarEncargadoPorId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("El ID del encargado a buscar no puede ser nulo.");
        }
        return encargadoDAO.buscarPorId(id);
    }
    
    public List<Encargado> buscarEncargadoPorNombreUsuario(String nombreUsuario){
        try {
            return encargadoDAO.buscarPorNombreUsuario(nombreUsuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, usuario no existente", "Aviso", ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    public List<Encargado> mostrarTodosLosEncargados() {
        return encargadoDAO.mostrarTodas();
    }
    
}
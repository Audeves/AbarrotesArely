/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import DAOs.PersonaDAO;
import Entidades.Persona;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Desktop
 */
public class PersonaService {
    private final PersonaDAO personaDAO;

    public PersonaService() {
        personaDAO = new PersonaDAO();
    }

    public void agregarPersona(Persona persona) {
        // Lógica adicional antes de agregar la persona, si es necesario
        personaDAO.agregar(persona);
    }

    public void eliminarPersona(Persona persona) {
        // Lógica adicional antes de eliminar la persona, si es necesario
        personaDAO.eliminar(persona);
    }

    public void actualizarPersona(Persona persona) {
        // Lógica adicional antes de actualizar la persona, si es necesario
        personaDAO.actualizar(persona);
    }

    public Persona buscarPersonaPorId(Integer id) {
        // Lógica adicional antes de buscar la persona por ID, si es necesario
        return personaDAO.buscarPorId(id);
    }

    public List<Persona> mostrarTodasLasPersonas() {
        // Lógica adicional antes de mostrar todas las personas, si es necesario
        return personaDAO.mostrarTodas();
    }
    
}
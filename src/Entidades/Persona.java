/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Desktop
 */
@Entity
@Table(name = "persona")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
//    , @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona")
//    , @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre")
//    , @NamedQuery(name = "Persona.findByCiudad", query = "SELECT p FROM Persona p WHERE p.ciudad = :ciudad")
//    , @NamedQuery(name = "Persona.findByCurp", query = "SELECT p FROM Persona p WHERE p.curp = :curp")
//    , @NamedQuery(name = "Persona.findByCalle", query = "SELECT p FROM Persona p WHERE p.calle = :calle")
//    , @NamedQuery(name = "Persona.findByColonia", query = "SELECT p FROM Persona p WHERE p.colonia = :colonia")
//    , @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idPersona;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "ciudad", nullable = false)
    private String ciudad;
    
    @Column(name = "curp", nullable = false)
    private String curp;
    
    @Column(name = "calle", nullable = false)
    private String calle;
    
    @Column(name = "colonia", nullable = false)
    private String colonia;
    
    @Column(name = "telefono", nullable = false)
    private String telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    private List<Encargado> encargados;

    public Persona() {
    }

    public Persona(String nombre, String ciudad, String curp, String calle, String colonia, String telefono) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.curp = curp;
        this.calle = calle;
        this.colonia = colonia;
        this.telefono = telefono;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Collection<Encargado> getEncargadoCollection() {
        return encargados;
    }

    public void setEncargadoCollection(List<Encargado> encargadoCollection) {
        this.encargados = encargadoCollection;
    }

}

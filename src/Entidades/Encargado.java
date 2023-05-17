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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "encargado")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Encargado.findAll", query = "SELECT e FROM Encargado e")
//    , @NamedQuery(name = "Encargado.findByIdencargado", query = "SELECT e FROM Encargado e WHERE e.idencargado = :idencargado")
//    , @NamedQuery(name = "Encargado.findByRfc", query = "SELECT e FROM Encargado e WHERE e.rfc = :rfc")})
public class Encargado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idencargado;
    
    @Column(name = "usuario", nullable = false)
    private String usuario;
    
    @Column(name = "contraseña", nullable = false)
    private String contraseña;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "encargado")
    private List<Venta> ventas;
    
    @JoinColumn(name = "idPersona", nullable = false)
    @ManyToOne()
    private Persona persona;

    public Encargado() {
    }

    public Encargado(String usuario) {
        this.usuario = usuario;
    }

    public Encargado(String usuario, String contraseña, Persona persona) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.persona = persona;
    }

    public Integer getIdencargado() {
        return idencargado;
    }

    public void setIdencargado(Integer idencargado) {
        this.idencargado = idencargado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Collection<Venta> getVentaCollection() {
        return ventas;
    }

    public void setVentaCollection(List<Venta> ventaCollection) {
        this.ventas = ventaCollection;
    }

    public Persona getPersonaidPersona() {
        return persona;
    }

    public void setPersonaidPersona(Persona personaidPersona) {
        this.persona = personaidPersona;
    }

    @Override
    public String toString() {
        return "Encargado{" + "idencargado=" + idencargado + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", ventas=" + ventas + ", persona=" + persona + '}';
    }
    
}

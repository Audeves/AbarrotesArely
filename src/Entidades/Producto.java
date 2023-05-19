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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Desktop
 */
@Entity
@Table(name = "producto")
//@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
//    , @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto")
//    , @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto")
//    , @NamedQuery(name = "Producto.findByPrecioActual", query = "SELECT p FROM Producto p WHERE p.precioActual = :precioActual")
//    , @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock")
//    , @NamedQuery(name = "Producto.findByCategoria", query = "SELECT p FROM Producto p WHERE p.categoria = :categoria")})
public class Producto implements Serializable {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;
    
    @Column(name = "nombreProducto", nullable = false)
    private String nombreProducto;
    
    @Column(name = "precioActual", nullable = false)
    private float precioActual;
    
    @Column(name = "stock", nullable = false)
    private int stock;
    
    @Column(name = "categoria", nullable = false)
    private String categoria;
    
    @Column(name = "existencia", nullable = false)
    private boolean existencia;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<RelProductosVentas> relProductosVentasCollection;

    public Producto() {
    }
    
    public Producto(Integer Id) {
        this.Id = Id;
    }
    
    public Producto(Integer Id, String nombreProducto, float precioActual, int stock, String categoria) {
        this.Id = Id;
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Producto(String nombreProducto, float precioActual, int stock, String categoria) {
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Producto(String nombreProducto, float precioActual, int stock, String categoria, boolean existencia) {
        this.nombreProducto = nombreProducto;
        this.precioActual = precioActual;
        this.stock = stock;
        this.categoria = categoria;
        this.existencia = existencia;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(float precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean getExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }

    public List<RelProductosVentas> getRelProductosVentasCollection() {
        return relProductosVentasCollection;
    }

    public void setRelProductosVentasCollection(List<RelProductosVentas> relProductosVentasCollection) {
        this.relProductosVentasCollection = relProductosVentasCollection;
    }    
}

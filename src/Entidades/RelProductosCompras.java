/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Desktop
 */
@Entity
@Table(name = "rel_productos_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelProductosCompras.findAll", query = "SELECT r FROM RelProductosCompras r")
    , @NamedQuery(name = "RelProductosCompras.findByRelProductosCompras", query = "SELECT r FROM RelProductosCompras r WHERE r.relProductosCompras = :relProductosCompras")
    , @NamedQuery(name = "RelProductosCompras.findByPrecioCom", query = "SELECT r FROM RelProductosCompras r WHERE r.precioCom = :precioCom")
    , @NamedQuery(name = "RelProductosCompras.findByCantidad", query = "SELECT r FROM RelProductosCompras r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "RelProductosCompras.findByMontoFinal", query = "SELECT r FROM RelProductosCompras r WHERE r.montoFinal = :montoFinal")})
public class RelProductosCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "rel_productos_compras")
    private Integer relProductosCompras;
    @Basic(optional = false)
    @Column(name = "precio_com")
    private float precioCom;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "monto_final")
    private float montoFinal;
    @JoinColumns({
        @JoinColumn(name = "compra_idcompra", referencedColumnName = "idcompra")
        , @JoinColumn(name = "compra_proveedor_idproveedor", referencedColumnName = "proveedor_idproveedor")
        , @JoinColumn(name = "compra_proveedor_persona_idPersona", referencedColumnName = "proveedor_persona_idPersona")})
    @ManyToOne(optional = false)
    private Compra compra;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto productoIdproducto;

    public RelProductosCompras() {
    }

    public RelProductosCompras(Integer relProductosCompras) {
        this.relProductosCompras = relProductosCompras;
    }

    public RelProductosCompras(Integer relProductosCompras, float precioCom, int cantidad, float montoFinal) {
        this.relProductosCompras = relProductosCompras;
        this.precioCom = precioCom;
        this.cantidad = cantidad;
        this.montoFinal = montoFinal;
    }

    public Integer getRelProductosCompras() {
        return relProductosCompras;
    }

    public void setRelProductosCompras(Integer relProductosCompras) {
        this.relProductosCompras = relProductosCompras;
    }

    public float getPrecioCom() {
        return precioCom;
    }

    public void setPrecioCom(float precioCom) {
        this.precioCom = precioCom;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getMontoFinal() {
        return montoFinal;
    }

    public void setMontoFinal(float montoFinal) {
        this.montoFinal = montoFinal;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Producto getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(Producto productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (relProductosCompras != null ? relProductosCompras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelProductosCompras)) {
            return false;
        }
        RelProductosCompras other = (RelProductosCompras) object;
        if ((this.relProductosCompras == null && other.relProductosCompras != null) || (this.relProductosCompras != null && !this.relProductosCompras.equals(other.relProductosCompras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RelProductosCompras[ relProductosCompras=" + relProductosCompras + " ]";
    }
    
}

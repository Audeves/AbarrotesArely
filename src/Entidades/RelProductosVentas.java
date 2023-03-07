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
@Table(name = "rel_productos_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RelProductosVentas.findAll", query = "SELECT r FROM RelProductosVentas r")
    , @NamedQuery(name = "RelProductosVentas.findByIdrelProductosVentas", query = "SELECT r FROM RelProductosVentas r WHERE r.idrelProductosVentas = :idrelProductosVentas")
    , @NamedQuery(name = "RelProductosVentas.findByCantidadVendida", query = "SELECT r FROM RelProductosVentas r WHERE r.cantidadVendida = :cantidadVendida")
    , @NamedQuery(name = "RelProductosVentas.findByPrecioVenta", query = "SELECT r FROM RelProductosVentas r WHERE r.precioVenta = :precioVenta")
    , @NamedQuery(name = "RelProductosVentas.findBySubtotal", query = "SELECT r FROM RelProductosVentas r WHERE r.subtotal = :subtotal")})
public class RelProductosVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idrel_productos_ventas")
    private Integer idrelProductosVentas;
    @Basic(optional = false)
    @Column(name = "cantidad_vendida")
    private int cantidadVendida;
    @Basic(optional = false)
    @Column(name = "precio_venta")
    private float precioVenta;
    @Basic(optional = false)
    @Column(name = "subtotal")
    private float subtotal;
    @JoinColumn(name = "producto_idproducto", referencedColumnName = "idproducto")
    @ManyToOne(optional = false)
    private Producto productoIdproducto;
    @JoinColumn(name = "venta_idventa", referencedColumnName = "idventa")
    @ManyToOne(optional = false)
    private Venta ventaIdventa;

    public RelProductosVentas() {
    }

    public RelProductosVentas(Integer idrelProductosVentas) {
        this.idrelProductosVentas = idrelProductosVentas;
    }

    public RelProductosVentas(Integer idrelProductosVentas, int cantidadVendida, float precioVenta, float subtotal) {
        this.idrelProductosVentas = idrelProductosVentas;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
        this.subtotal = subtotal;
    }

    public Integer getIdrelProductosVentas() {
        return idrelProductosVentas;
    }

    public void setIdrelProductosVentas(Integer idrelProductosVentas) {
        this.idrelProductosVentas = idrelProductosVentas;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProductoIdproducto() {
        return productoIdproducto;
    }

    public void setProductoIdproducto(Producto productoIdproducto) {
        this.productoIdproducto = productoIdproducto;
    }

    public Venta getVentaIdventa() {
        return ventaIdventa;
    }

    public void setVentaIdventa(Venta ventaIdventa) {
        this.ventaIdventa = ventaIdventa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrelProductosVentas != null ? idrelProductosVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelProductosVentas)) {
            return false;
        }
        RelProductosVentas other = (RelProductosVentas) object;
        if ((this.idrelProductosVentas == null && other.idrelProductosVentas != null) || (this.idrelProductosVentas != null && !this.idrelProductosVentas.equals(other.idrelProductosVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.RelProductosVentas[ idrelProductosVentas=" + idrelProductosVentas + " ]";
    }
    
}

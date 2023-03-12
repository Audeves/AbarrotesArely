/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
//@NamedQueries({
//    @NamedQuery(name = "RelProductosVentas.findAll", query = "SELECT r FROM RelProductosVentas r")
//    , @NamedQuery(name = "RelProductosVentas.findByIdrelProductosVentas", query = "SELECT r FROM RelProductosVentas r WHERE r.id = :idrelProductosVentas")
//    , @NamedQuery(name = "RelProductosVentas.findByCantidadVendida", query = "SELECT r FROM RelProductosVentas r WHERE r.cantidadVendida = :cantidadVendida")
//    , @NamedQuery(name = "RelProductosVentas.findByPrecioVenta", query = "SELECT r FROM RelProductosVentas r WHERE r.precioVenta = :precioVenta")
//    , @NamedQuery(name = "RelProductosVentas.findBySubtotal", query = "SELECT r FROM RelProductosVentas r WHERE r.subtotal = :subtotal")})
public class RelProductosVentas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "cantidad_vendida", nullable = false)
    private int cantidadVendida;

    @Column(name = "precioVenta", nullable = false)
    private float precioVenta;

    @Column(name = "subtotal", nullable = false)
    private float subtotal;

    @JoinColumn(name = "idProducto", nullable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    @JoinColumn(name = "idVenta", nullable = false)
    @ManyToOne(optional = false)
    private Venta venta;

    public RelProductosVentas() {
    }

    public RelProductosVentas( int cantidadVendida, float precioVenta, float subtotal, Producto Producto, Venta venta) {
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
        this.subtotal = subtotal;
        this.producto = Producto;
        this.venta = venta;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto Producto) {
        this.producto = Producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Id != null ? Id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelProductosVentas)) {
            return false;
        }
        RelProductosVentas other = (RelProductosVentas) object;
        if ((this.Id == null && other.Id != null) || (this.Id != null && !this.Id.equals(other.Id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RelProductosVentas{" + "Id=" + Id + ", cantidadVendida=" + cantidadVendida + ", precioVenta=" + precioVenta + ", subtotal=" + subtotal + ", Producto=" + producto + ", venta=" + venta + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Practicante3CSI
 */
public class ProductoDTO {

    private int idProducto;
    private String nombreProduto;
    private int cantidad;
    private float subtotal;
    private float precioVenta;

    public ProductoDTO() {
    }

    public ProductoDTO(int idProducto, float precioVenta,int cantidad, float subtotal) {
        this.idProducto = idProducto;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public ProductoDTO(int idProducto, String nombreProduto, int cantidad, float subtotal, float precioVenta) {
        this.idProducto = idProducto;
        this.nombreProduto = nombreProduto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.precioVenta = precioVenta;
    }

    public String getNombreProduto() {
        return nombreProduto;
    }

    public void setNombreProduto(String nombreProduto) {
        this.nombreProduto = nombreProduto;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idProducto;
        hash = 89 * hash + this.cantidad;
        hash = 89 * hash + Float.floatToIntBits(this.subtotal);
        hash = 89 * hash + Float.floatToIntBits(this.precioVenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductoDTO other = (ProductoDTO) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Float.floatToIntBits(this.subtotal) != Float.floatToIntBits(other.subtotal)) {
            return false;
        }
        if (Float.floatToIntBits(this.precioVenta) != Float.floatToIntBits(other.precioVenta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" + "idProducto=" + idProducto + ", cantidad=" + cantidad + ", subtotal=" + subtotal + ", precioVenta=" + precioVenta + '}';
    }

}

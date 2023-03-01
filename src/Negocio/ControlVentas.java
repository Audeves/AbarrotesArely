/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Desktop
 */
public class ControlVentas {
    
    public ControlVentas() {
    }
     
    public float ventaNoGranel(int cantidad, float precio){
        return cantidad * precio;
    }
    
    public float ventaGranel(float cantidad, float precio){
        return cantidad * precio;
    }
}

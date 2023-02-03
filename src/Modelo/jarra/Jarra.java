/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.jarra;

/**
 *
 * @author David Campoverde
 */
public class Jarra {
    private Integer capacidad;
    private Integer capacidad_actual;

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getCapacidad_actual() {
        return capacidad_actual;
    }

    public void setCapacidad_actual(Integer capacidad_actual) {
        this.capacidad_actual = capacidad_actual;
    }

    @Override
    public String toString() {
        return "Jarra("+capacidad + ") = "+capacidad_actual;
    }
    
    
    
}

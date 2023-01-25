/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Enum.Orientacion;


/**
 *
 * @author David Campoverde
 */
public class Posicion {
    private Integer arbol;
    private Double latitud;
    private Double longitud;
    private Orientacion orientacion;

    public Integer getArbol() {
        return arbol;
    }

    public void setArbol(Integer arbol) {
        this.arbol = arbol;
    }
    
    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

//    public String getLatitud() {
//        return latitud;
//    }
//    
//    public void setLatitud(String latitud) {
//        this.latitud = latitud;
//    }
//
//    public String getLongitud() {
//        return longitud;
//    }
//
//    public void setLongitud(String longitud) {
//        this.longitud = longitud;
//    }
    public void setLongitud(Double longitud) {    
        this.longitud = longitud;
    }

    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }

    

    @Override
    public String toString() {
        return latitud+ "/"+longitud+"-"+orientacion;
    }
    
    
    
}

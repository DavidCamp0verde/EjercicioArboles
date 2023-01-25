/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ListaEnlazada.ListaEnlazada;

/**
 * Practica: FLOYD Y DIJKSTRA
 * @author David Campoverde
 */
public class Arbol {
    private Integer id;
    private String nombre;
    private String nombreCientifico;
    private String descripcion;
    private ListaEnlazada<Posicion> posicion;
    
    public Arbol(){
        posicion = new ListaEnlazada<>();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ListaEnlazada<Posicion> getPosicion() {
        return posicion;
    }

    public void setPosicion(ListaEnlazada<Posicion> posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre + " - " + nombreCientifico+" - "+descripcion;
    }

    
    
    
    
}

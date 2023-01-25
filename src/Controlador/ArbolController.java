/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Arbol;

/**
 *
 * @author David Campoverde
 */
public class ArbolController {
    private ListaEnlazada<Arbol> arboles = new ListaEnlazada<>();

    public ListaEnlazada<Arbol> getArboles() {
        return arboles;
    }

    public void setArboles(ListaEnlazada<Arbol> arboles) {
        this.arboles = arboles;
    }
    
    
}

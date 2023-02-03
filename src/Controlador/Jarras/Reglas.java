/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.Jarras;

import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.jarra.Jarra;

/**
 *
 * @author David Campoverde
 */
public class Reglas {
    
    public static ListaEnlazada<NodoJarra> reglas(Jarra jg, Jarra jp){
        Integer x = jg.getCapacidad_actual();
        Integer y = jp.getCapacidad_actual();
        ListaEnlazada<NodoJarra> lista = new ListaEnlazada<>();
        //R1
        if(x < jg.getCapacidad()){
            lista.insertar(new NodoJarra(jg.getCapacidad(), y));
        }
        //R2
        if(y < jp.getCapacidad()){
            lista.insertar(new NodoJarra(x, jp.getCapacidad()));
        }
        //R3
        if(x > 0){
            lista.insertar(new NodoJarra(0, y));
        }
        //R4
        if(y > 0){
            lista.insertar(new NodoJarra(x, 0));
        }
        //R5: llenar la jarra de 4 litros con la de 3
        if(x+y >= jg.getCapacidad() && x < jg.getCapacidad() && y > 0){
            lista.insertar(new NodoJarra(jg.getCapacidad(), y - (jg.getCapacidad() - x)));
        }
        //R6: llenar la jarra de 3 litros con la de 4
        if(x+y >= jp.getCapacidad() && y < jp.getCapacidad() && y > 0){
            lista.insertar(new NodoJarra(x-(jp.getCapacidad() - y),jg.getCapacidad()));
        }
        //R7: vaciar la jarra de 3 litros en la jarra de 4
        if(((x+y) <= jg.getCapacidad()) && y > 0){
            lista.insertar(new NodoJarra((x+y), 0));
        }
        //R8: vaciar la jarra de 4 litros en la jarra de 3
        if((x+y) >= jp.getCapacidad() && x > 0){
            lista.insertar(new NodoJarra(0, (x+y)));
        }
        return lista;
    }
    
}

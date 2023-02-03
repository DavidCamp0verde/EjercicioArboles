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
public class NodoJarra {
    private Jarra jarraG;
    private Jarra jarraP;
    private NodoJarra padre;
    private ListaEnlazada<NodoJarra> sucesores = new ListaEnlazada<>();
    
    public NodoJarra(){
        jarraG = new Jarra();
        jarraP = new Jarra();
        jarraG.setCapacidad(4);
        jarraP.setCapacidad(3);
        jarraG.setCapacidad_actual(0);
        jarraP.setCapacidad_actual(0);
    }
    
    public NodoJarra(Integer cjarraG, Integer cjarraP){
        this();
        jarraG.setCapacidad_actual(cjarraG);
        jarraP.setCapacidad_actual(cjarraP);
    }
    
    public void crearJarras(Integer cjarraG, Integer cjarraP){
        jarraG.setCapacidad(cjarraG);
        jarraP.setCapacidad(cjarraP);
    }
    
    public void fijarEstadoJarras(Integer cjarraG, Integer cjarraP){
        jarraG.setCapacidad_actual(cjarraG);
        jarraP.setCapacidad_actual(cjarraP);
    }
    
    public static Boolean comparar(NodoJarra i, NodoJarra f) {
        if(i != null && f != null) {
            if(i.getJarraG().getCapacidad_actual().intValue() == f.getJarraG().getCapacidad_actual().intValue()
                && i.getJarraP().getCapacidad_actual().intValue() == f.getJarraP().getCapacidad_actual().intValue()) {
            return true;
            }
        }
        return false;
    }
    
    public void aplicarReglas(ListaEnlazada<NodoJarra> reglas){
        sucesores = new ListaEnlazada<>();
        if(reglas.getSize() > 0){
            NodoJarra[] reglasArreglo = reglas.toArray();
            for(int i = 0; i < reglasArreglo.length; i++){
                NodoJarra aux = reglasArreglo[i];
                aux.setPadre(this);
                sucesores.insertarCabecera(aux);
            }
        }
    }
    
    public Jarra getJarraG() {
        return jarraG;
    }

    public void setJarraG(Jarra jarraG) {
        this.jarraG = jarraG;
    }

    public Jarra getJarraP() {
        return jarraP;
    }

    public void setJarraP(Jarra jarraP) {
        this.jarraP = jarraP;
    }

    public NodoJarra getPadre() {
        return padre;
    }

    public void setPadre(NodoJarra padre) {
        this.padre = padre;
    }

    public ListaEnlazada<NodoJarra> getSucesores() {
        return sucesores;
    }

    public void setSucesores(ListaEnlazada<NodoJarra> sucesores) {
        this.sucesores = sucesores;
    }
    
    @Override
    public String toString() {
        return "(" + jarraG + " - " + jarraP + ')';
    }
    
    
    
}

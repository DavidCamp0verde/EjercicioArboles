/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.ModeloTabla;

import javax.swing.table.AbstractTableModel;
import Controlador.Arbol.Arbol;
import Controlador.Arbol.NodoArbol;
import Controlador.ListaEnlazada.ListaEnlazada;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaArbolBinario extends AbstractTableModel {

    private Arbol arbol;

    @Override
    public int getRowCount() {
        return arbol.getNiveles().getSize();
    }

    @Override
    public int getColumnCount() {
        return arbol.getNro_nodos();
    }

    @Override
    public String getColumnName(int column) {
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            if(arbol.getNiveles().obtener(rowIndex).obtener(columnIndex).getDato() == null){
                return "---";
            }else{
                return arbol.getNiveles().obtener(rowIndex).obtener(columnIndex).getDato();
            }
        } catch (Exception e) {
        }
        return "";
    }

    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

}

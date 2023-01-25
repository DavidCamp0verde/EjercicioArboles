/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.ModeloTabla;

import Controlador.ArbolController;
import Controlador.ListaEnlazada.ListaEnlazada;
import Modelo.Arbol;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaArbol extends AbstractTableModel{
    private ArbolController arboles;
    
    @Override
    public int getRowCount() {
        return arboles.getArboles().getSize();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "ID";
            case 1: return "Nombre";
            case 2: return "Nombre Cientifico";
            case 3: return "Descripcion";
            default:return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Arbol a = null;
        try {
            a = arboles.getArboles().obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return a.getNombre();
            case 2: return a.getNombreCientifico();
            case 3: return a.getDescripcion();
            default:return null;
        }
    }

    public ArbolController getArboles() {
        return arboles;
    }

    public void setArboles(ArbolController arboles) {
        this.arboles = arboles;
    }

    
    
    
}

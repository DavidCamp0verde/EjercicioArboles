/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.ModeloTabla;

import Modelo.Arbol;
import Modelo.Posicion;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author David Campoverde
 */
public class ModeloTablaPosiciones extends AbstractTableModel{
    private Arbol arbol;
    @Override
    public int getRowCount() {
        return arbol.getPosicion().getSize();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0: return "Nro";
            case 1: return "Latitud";
            case 2: return "Longitud";
            case 3: return "Orientacion";
            default:return null;
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        Posicion p = null;
        try {
            p = arbol.getPosicion().obtener(rowIndex);
        } catch (Exception e) {
        }
        
        switch(columnIndex){
            case 0: return rowIndex+1;
            case 1: return p.getLatitud();
            case 2: return p.getLongitud();
            case 3: return p.getOrientacion().toString();
            default:return null;
        }
    }
    
    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }
    
    
}

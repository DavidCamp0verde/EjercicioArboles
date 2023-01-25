/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Utilidades;

import Controlador.ArbolController;
import Controlador.ListaEnlazada.ListaEnlazada;
import Controlador.PosicionController;
import Modelo.Arbol;
import Modelo.Enum.Orientacion;
import Modelo.Posicion;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JComboBox;

/**
 *
 * @author David Campoverde
 */
public class Utilidades {
    public static JComboBox cargarComboTipo(JComboBox cbx){
        cbx.removeAllItems();
        for (Orientacion orientacion : Orientacion.values()) {
            cbx.addItem(orientacion);
        }
        return cbx;
    }
    
    public static Orientacion getTipoCombo(JComboBox cbx){
        return (Orientacion)cbx.getSelectedItem();
    }
    
    public static JComboBox cargarComboPosiciones(JComboBox cbx, PosicionController pc){
        cbx.removeAllItems();
        for(int i = 1; i <= pc.getPosiciones().getSize(); i++){
            try {
                cbx.addItem(pc.getPosiciones().obtener(i).toString());
            } catch (Exception e) {
            }
        }
        return cbx;
    }
    
    public static Posicion getPosicionCombo(JComboBox cbx){
        return (Posicion)cbx.getSelectedItem();
    }
    
    public static boolean guardarArchivoJSON(ArbolController arbol){
        Gson gson = new Gson();
        String json = gson.toJson(arbol);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("dataJSON.json"))){
            bw.write(json);
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }    
        
    }
    
    public static ArbolController cargarArchivoJSON(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("dataJSON.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            br.close();
            
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        ArbolController arboles = gson.fromJson(json, ArbolController.class);
        return arboles;
    }
    
    public static boolean guardarPosiciones(PosicionController posiciones){
        Gson gson = new Gson();
        String json = gson.toJson(posiciones);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("posicionesJSON.json"))){
            bw.write(json);
            return true;
        } catch (Exception e) {
            System.out.println("Error"+e);
            return false;
        }    
        
    }
    
    public static PosicionController cargarPosicones(){
        String json = "";
        Gson gson = new Gson();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("posicionesJSON.json"));
            String linea = "";
            while((linea = br.readLine()) != null){
                json += linea;
            }
            br.close();
            
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
        
        PosicionController posiciones = gson.fromJson(json, PosicionController.class);
        return posiciones;
    }
}

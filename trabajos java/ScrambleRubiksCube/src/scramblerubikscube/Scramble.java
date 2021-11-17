/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scramblerubikscube;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author claudia
 */
public class Scramble {
    
    private List<String> listaScramble;
//    private List<String> solucion;

    public Scramble() {
        this.listaScramble = new ArrayList<>();
//        this.solucion = new ArrayList<>();
    }
    
    public void addToLista(String valor){ 
        listaScramble.add(valor);
    }
    
    public void removeFromLista(int valor){ 
        listaScramble.remove(valor);
    }
    
    public String getFromLista(int valor){ 
        return listaScramble.get(valor);
    }

    public List<String> getListaScramble() {
        return listaScramble;
    }
    
//    public void addToSolucion(String valor){ 
//        solucion.add(valor);
//    }
//    
//    public void removeFromSolucion(int valor){ 
//        solucion.remove(valor);
//    }
//    
//    public String getFromSolucion(int valor){ 
//        return solucion.get(valor);
//    }
//
//    public List<String> getListaSolucion() {
//        return solucion;
//    }
}

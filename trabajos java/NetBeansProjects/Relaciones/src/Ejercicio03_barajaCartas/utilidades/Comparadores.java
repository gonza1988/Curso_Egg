/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_barajaCartas.utilidades;

import Ejercicio03_barajaCartas.entidades.Carta;
import java.util.Comparator;

/**
 *
 * @author Gonza Cozzo
 */
public class Comparadores {
    
    
    //Lo declaro estatico al metodo, accedo de forma directa NOMBRECLASE.nombreMetodo
    public static Comparator <Carta> ordenarporNumAsc=  new Comparator<Carta> (){
        @Override
        public int compare(Carta o1, Carta o2){
            return o1.getNumero().compareTo(o2.getNumero());
    }
};
       
     public static Comparator <Carta> ordenarporPaloAsc=  new Comparator<Carta> (){
        @Override
        public int compare(Carta p1, Carta p2){
            return (p1.getPalo().compareTo(p2.getPalo()));
    }
};
}


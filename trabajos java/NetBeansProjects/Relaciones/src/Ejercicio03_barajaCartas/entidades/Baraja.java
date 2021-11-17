/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03_barajaCartas.entidades;

import Ejercicio03_barajaCartas.enumeraciones.Palo;
import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class Baraja {
    
    private ArrayList<Carta>listaCartas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    public ArrayList<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "listaCartas= " + "\n"+listaCartas + '}';
    }


    
}

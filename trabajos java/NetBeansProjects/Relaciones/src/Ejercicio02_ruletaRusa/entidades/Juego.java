/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_ruletaRusa.entidades;

import java.util.ArrayList;

/**
 *
 * @author Gonza Cozzo
 */
public class Juego {
    
    private ArrayList<Jugador>jugadores = new ArrayList();
    private RevolverDeAgua Revolver;

    public Juego() {
    }

    public Juego(RevolverDeAgua Revolver) {
        this.Revolver = Revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return Revolver;
    }

    public void setRevolver(RevolverDeAgua Revolver) {
        this.Revolver = Revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", Revolver=" + Revolver + '}';
    }
    
    

}

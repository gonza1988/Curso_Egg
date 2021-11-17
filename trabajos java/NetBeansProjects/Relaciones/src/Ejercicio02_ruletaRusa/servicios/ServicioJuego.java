/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_ruletaRusa.servicios;

import Ejercicio02_ruletaRusa.entidades.Jugador;
import Ejercicio02_ruletaRusa.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioJuego {


    public void llenarJuego(ServicioJugador SJ) {

        SJ.crearJugadores();
        
        //SJ.disparo(SR);


    }
    
    public void ronda (ServicioJugador SJ,ServicioRevolverDeAgua SR){
        
        SJ.disparo(SR);
    }

}

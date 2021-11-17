/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02_ruletaRusa.servicios;

import Ejercicio02_ruletaRusa.entidades.Jugador;
import Ejercicio02_ruletaRusa.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioJugador {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     ArrayList<Jugador>jugadores = new ArrayList();
    
    public ArrayList<Jugador> crearJugadores(){
           
        
        System.out.println("Ingrese la cantidad de jugadores a empezar el juego: ");
        int numjugadores = leer.nextInt();
        
        if (numjugadores < 1 || numjugadores > 6) {
            
            numjugadores = 6;
        }
        
        for (int i = 0; i < numjugadores; i++) {
           // Jugador j = new Jugador();
            jugadores.add(new Jugador(i+1));
        }
        return jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

 
    
    
    
    public void disparo(ServicioRevolverDeAgua sR ){
        boolean mojar = false;
        int cont = 1;
        //ServicioRevolverDeAgua sR = new ServicioRevolverDeAgua();
        
        sR.llenarRevolver();
       
        do{
                 
        for (Jugador aux : jugadores) {
            System.out.println("*** RONDA: " + cont + " ***");
            cont++;

            
            if ( sR.mojar() == true) {
                
                aux.setMojado(true);
                System.out.println("El jugador "+aux.getId()+ " ha sido mojado");
                System.out.println(aux.toString());
                mojar = true;
                System.out.println(sR.toString());
                break;
               
            } else {
                aux.setMojado(false);
                System.out.println(aux.toString());
                System.out.println(sR.toString());
                sR.siguienteChorro();
            }
        }
        
        } while (mojar == false);          
            
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_cancion;

import Ejercicio01_extra_cancion.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio01_extramain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
        definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
        vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
        además definir los métodos getters y setters correspondientes */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Cancion nuevoTema1 = new Cancion();
        System.out.println(nuevoTema1.toString());
        
        System.out.println("Ingrese Titulo:");
        String titulo = leer.next();
        System.out.println("Ingrese el autor:");
        String autor = leer.next();
        Cancion nuevoTema2 = new Cancion(titulo,autor);
        System.out.println(nuevoTema2.toString());
        
        
    }
    
}

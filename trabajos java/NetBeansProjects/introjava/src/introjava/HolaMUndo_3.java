/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class HolaMUndo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea una variable Scanner que se utiliza para leer datos del usuusario
        Scanner leer = new Scanner (System.in);
        //Se crea una variable String para leer datos del ususario
        String nombre;
        //muestra un mensaje por pantalla
        System.out.println("Ingresa tu nombre");
        //Leemos el nombre de la persona en la variable nombre
        nombre = leer.next();
        //mostramos por consola un saludo personalizado
        System.out.println("Hola mundo soy " + nombre + " y estoy programando en Java");
    }
    
}

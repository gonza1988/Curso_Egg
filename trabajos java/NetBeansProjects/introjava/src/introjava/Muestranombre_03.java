package introjava;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIGABYTE
 */
public class Muestranombre_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 3. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
        por pantalla */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        System.out.println("Hola mundo soy " + nombre + " y estoy programando en Java");
    }
    
}

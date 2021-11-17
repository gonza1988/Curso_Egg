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
public class PrimeraLetraA_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 11. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
        frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
        pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
        “INCORRECTO”. Nota: investigar la función Substring y equals() de Java. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String palabra, letra;
         System.out.println("Ingrese palabra ");
         palabra = leer.next();
         
        letra = palabra.substring(0, 1);
        System.out.println("Primer letra de palabra " + letra);
        
        if(letra.equals("A") == true){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        
        charAt(palabra);
    }
    
    public static void charAt(String palabra){
        
        if(palabra.charAt(0) == 'A'){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}

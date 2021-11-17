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
public class Mensajequals_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
        pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
        investigar la función equals() en Java. */
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         String frase;
         System.out.println("Ingrese frase a comparar");
         frase = leer.next();
         
         if(frase.equals("eureka") == true){
             System.out.println("Correcto");
         } else {
             System.out.println("Incorrecto");
         }
             
    }
    
}

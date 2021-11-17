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
public class LLenaVectorYmuestraDescendente_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
        los muestre por pantalla en orden descendente. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int vector[] = new int[20];
        
        //En dos pasos:
      /*  for (int i = 0; i < vector.length; i++) {
         
            vector[i] = i+1;
        }*/
        
      //Forma directa:
        for (int i = vector.length-1; i >= 0; i--) {
         
            vector[i] = i+1;
            System.out.println("Vector: [ " +vector[i]+ " ]");
        }
        System.out.println(" ");
     }
    
}

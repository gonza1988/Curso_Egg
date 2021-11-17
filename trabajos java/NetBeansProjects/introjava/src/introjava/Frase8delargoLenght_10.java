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
public class Frase8delargoLenght_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 10. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
        largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
        un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
        imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String palabra;
         System.out.println("Ingrese palabra de 8 caracteres");
         palabra = leer.next();
         
         if(palabra.length() == 8){
             System.out.println("CORRECTO");
         } else {
             System.out.println("INCORRECTO");
         }
    }
    
}

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
public class MayusculaMinuscula_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
        después toda en minúsculas. Nota: investigar la función toUpperCase() y
        toLowerCase() en Java. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String frase;
        System.out.println("Ingrese frase a convertir!");
        frase = leer.next();
        System.out.println("------------------------------------------------------");
        System.out.println("toUpperCase: ");
        System.out.println("La frase " + frase + "toda en mayusculas es " + frase.toUpperCase());
        
        System.out.println("------------------------------------------------------");
        System.out.println("toLowerCase: ");
        System.out.println("La frase " + frase + "toda en minusculas es " + frase.toLowerCase());

    }
    
}

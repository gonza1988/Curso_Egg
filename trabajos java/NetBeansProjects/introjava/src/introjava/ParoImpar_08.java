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
public class ParoImpar_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 8. Crear un programa que dado un numero determine si es par o impar
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        if (numero == 0) {

            System.out.println("Es cero");

        } else if(numero % 2 == 0) {

            System.out.println("Es par");

        }else{
            
            System.out.println("Es impar");
            
        }
    }
    
}

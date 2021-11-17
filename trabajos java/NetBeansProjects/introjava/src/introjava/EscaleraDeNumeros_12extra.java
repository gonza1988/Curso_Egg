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
public class EscaleraDeNumeros_12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 12. Crear un programa que dibuje una escalera de números, donde cada línea de
        números comience en uno y termine en el número de la línea. Solicitar la altura de
        la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3: 
        1
        12
        123 */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int altura;
        System.out.println("Ingrese altura de la escalera: ");
        altura = leer.nextInt();
        
        escalera_numeros(altura);
    }
    
    public static void escalera_numeros(int altura){
        
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

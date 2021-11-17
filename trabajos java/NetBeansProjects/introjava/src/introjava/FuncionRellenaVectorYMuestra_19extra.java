/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class FuncionRellenaVectorYMuestra_19extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 19. Crear una función rellene un vector con números aleatorios, pasándole un arreglo
        por parámetro. Después haremos otra función o procedimiento que imprima el
        vector */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[] vector = new int[5];

        rellena_vector(vector);
        muestra_vector(vector);

    }

    public static void rellena_vector(int[] vector) {
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(20);
        }
    }
    
      public static void muestra_vector(int[] vector) {

        System.out.println("Subproceso Muestra Vector Original: ");
        for (int i = 0; i < vector.length; i++) {
                System.out.print("[ " + vector[i] + " ]");
            }
          System.out.println("");
 
    }
}

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
public class ComparaVectores_18extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 18. Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos). */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int tamaño;
        System.out.println("Ingrese tamaño deseado del vector: ");
        tamaño = leer.nextInt();
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        
        rellena_vector(vector1,tamaño);
        rellena_vector(vector2,tamaño);
        muestra_vector(vector1);
        muestra_vector(vector2);
        
        compara_vectores(vector1,vector2);
    }
    
    public static void rellena_vector(int[] vector, int tamaño){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num=0;
        
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese valores al vector");
            num = leer.nextInt();
            vector[i]= num;
        }
        
    }
    
     public static void muestra_vector(int[] vector) {

        System.out.println("Subproceso Muestra Vector Original: ");
        for (int i = 0; i < vector.length; i++) {
                System.out.print("[ " + vector[i] + " ]");
            }
            System.out.println("");
 
    }
    
    public static void compara_vectores(int[]vector1, int[]vector2){
        
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i]!= vector2[i]) {
                System.out.println("Valores distintos encontrados. Saliendo del programa");
                break;
            } else {
                System.out.println("Valores iguales encontrados");
            }
        }
    }
}

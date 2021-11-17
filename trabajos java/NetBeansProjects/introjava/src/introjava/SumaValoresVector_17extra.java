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
public class SumaValoresVector_17extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 17. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
        tamaño N, con los valores ingresados por el usuario. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int tamaño;
        System.out.println("Ingrese tamaño deseado del vector: ");
        tamaño = leer.nextInt();
        int[] vector = new int[tamaño];

        System.out.println("La suma de todos los valores del vector es igual a = "+suma_vector(vector, tamaño));
    }

    public static int suma_vector(int[] vector, int tamaño) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma_vector = 0, num = 0;

        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese valores al vector: ");
            num = leer.nextInt();
            vector[i] = num;
        }
        
        for (int i = 0; i < tamaño; i++) {
            suma_vector = suma_vector + vector[i];
        }
        return suma_vector;
    }
}

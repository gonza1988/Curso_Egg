/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class FuncionSumaMatrizNxM_21extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 21. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
        y muestre la suma de sus elementos */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int filas, columnas;
        System.out.println("Ingrese cantidad filas de la matriz: ");
        filas = leer.nextInt();
        System.out.println("Ingrese cantidad de columnas a la matriz: ");
        columnas = leer.nextInt();
        int[][] matriz = new int[filas][columnas];

        rellena_matriz(matriz,filas,columnas);
        muestra_matriz(matriz,filas,columnas);
        System.out.println("La suma de la matriz es = "+suma_matriz(matriz,filas,columnas));

    }

    public static void rellena_matriz(int[][] matriz, int filas, int columnas) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(20);
            }
        }
    }

    public static void muestra_matriz(int[][] matriz, int filas, int columnas) {

        System.out.println("Subproceso Muestra Matriz Original: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
    
    public static int suma_matriz(int[][] matriz,int filas, int columnas){
        int suma_vector=0;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma_vector= suma_vector + matriz[i][j];
            }
        }
        
        return suma_vector;
    }
}

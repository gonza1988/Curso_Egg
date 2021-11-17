/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import static introjava.MatrizDentroDeMatriz_28.verifica2_matriz;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class MatrizDentroDeMatriz2_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*28- Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
        P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
        contenida dentro de la matriz M. Para ello se debe verificar si entre todas las
        submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
        columnas, existe al menos una que coincida con la matriz P. En ese caso, el
        programa debe indicar la fila y la columna de la matriz M en la cual empieza el
        primer elemento de la submatriz P. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int[][] matrizP = new int[2][2];
        int[][] matrizM = new int[10][10];

        llenado_matriz(matrizP);
        llenado_matriz(matrizM);
        muestra_matriz(matrizP);
        muestra_matriz(matrizM);
        encuentra_matriz(matrizM, matrizP);

    }

    public static void llenado_matriz(int[][] matriz) {
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(3);
            }
        }

    }

    public static void muestra_matriz(int[][] matriz) {

        System.out.println("Subproceso Muestra Matriz Original: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }

    public static void encuentra_matriz(int[][] matrizM, int[][] matrizP) {
        boolean aux;

        System.out.println("Subproceso Encuentra Matriz: ");
        for (int i = 0; i < matrizM.length - 2; i++) {
            for (int j = 0; j < matrizM.length - 2; j++) {

                aux = true;

                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP.length; l++) {

                        if (matrizM[i + k][j + l] != matrizP[k][l]) {
                            aux = false;
                            break;
                        }

                    }
                }

                if (aux) {

                    System.out.println("Se encontro el patron en la columna: " + j + " y fila: " + i);
                    //return;
                }
            }
        }

        System.out.println("No se encontraron coincidencias! ");
    }

}


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
public class CuadradoMagico_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*27- Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
         donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
         programa que permita introducir un cuadrado por teclado y determine si este
         cuadrado es mágico o no. El programa deberá comprobar que los números
         introducidos son correctos, es decir, están entre el 1 y el 9. */

        int[][] matriz = new int[3][3];

        llenado_matriz(matriz);
        muestra_matriz(matriz);

        if (caja_magica(matriz) == true) {
            System.out.println("FELICITACIONES SU CUADRADO ES MAGICO!!");
        } else {
            System.out.println("SU CUADRADO NO ES MAGICO, A SEGUIR INTENTANDO!");
        }

    }

    public static void llenado_matriz(int[][] matriz) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valores de 0 al 9 a su cuadrado ");
                num = leer.nextInt();
                while (num < 0 || num > 9) {
                    System.out.println("Numero incorrecto, REINTENTE: ");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
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

    public static boolean caja_magica(int[][] matriz) {

        boolean caja_magica = true;
        int diagonalp = 0, diagonals = 0, sumafila, sumacolumna;

        //suma diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonalp += matriz[i][j];
                }
            }

        }
        System.out.println("La suma de la diagona principal es igual a:" + diagonalp);
        //suma diagonal secundaria
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((i + j) == matriz.length - 1) {
                    diagonals = diagonals + matriz[i][j];
                }
            }

        }
        System.out.println("La suma de la diagona secundaria es igual a:" + diagonals);
        if (diagonalp == diagonals) {
            caja_magica = caja_magica && true;

        } else {
            caja_magica = caja_magica && false;
        }

        //suma filas
        for (int i = 0; i < matriz.length; i++) {
            sumafila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumafila += matriz[i][j];
            }
            System.out.println("Suma fila" + "[ " + i + " ] :" + sumafila);
            if (diagonalp == sumafila) {
                caja_magica = caja_magica && true;
            } else {
                caja_magica = caja_magica && false;
            }
        }

        //suma columnas
        for (int i = 0; i < matriz.length; i++) {
            sumacolumna = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumacolumna += matriz[j][i];
            }
            System.out.println("Suma columna" + "[ " + i + " ] :" + sumacolumna);
            if (diagonalp == sumacolumna) {
                caja_magica = caja_magica && true;
            } else {
                caja_magica = caja_magica && false;
            }
        }
        return caja_magica;
    }
}

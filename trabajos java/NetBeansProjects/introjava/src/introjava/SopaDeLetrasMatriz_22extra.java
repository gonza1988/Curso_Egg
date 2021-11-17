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
public class SopaDeLetrasMatriz_22extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 22. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a
        medida que el usuario las va ingresando, construya una “sopa de letras para niños”
        de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden
        horizontal en una fila que será seleccionada de manera aleatoria. Una vez
        concluida la ubicación de las palabras, rellene los espacios no utilizados con un
        número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras
        creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
        funciones de Java substring(), Length() y Math.random(). */
        String palabra1 = "", palabra2 = "", palabra3 = "", palabra4 = "", palabra5 = "";
        String[][] sopa = new String[10][10];

        palabra1 = ingresaPalabra();
        palabra2 = ingresaPalabra();
        palabra3 = ingresaPalabra();
        palabra4 = ingresaPalabra();
        palabra5 = ingresaPalabra();

        palabraHorizontal(sopa, palabra1, coordenadaAleatria(), coordenadaAleatria());
        palabraVertical(sopa, palabra2, coordenadaAleatria(), coordenadaAleatria());
        palabraDiagonal(sopa,palabra3,coordenadaAleatria(),coordenadaAleatria());
        palabraDiagonalInvertida(sopa,palabra4, coordenadaAleatria(),coordenadaAleatria());
        palabraHorizontal(sopa, palabra5, coordenadaAleatria(), coordenadaAleatria());
        rellena_sopa(sopa);
        
        muestra_sopa(sopa);
    }

    public static String ingresaPalabra() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra = "";

        System.out.println("Ingrese 5 palabras a la sopa, que contenga entre 3 y 5 caracteres");
        palabra = leer.next();

        while (palabra.length() < 3 || palabra.length() > 5) {
            System.out.println("Palabra mal ingresada reintente: ");
            palabra = leer.next();
        }

        return palabra;
    }
    
    public static int coordenadaAleatria(){
        Random random = new Random();
        int num=0;
        
        num = random.nextInt(7);
        
        return num;
    }

    public static void palabraHorizontal(String[][] sopa, String palabra, int fila, int columna) {

        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila][columna + i] = "" + palabra.charAt(i);
        }
    }

    public static void palabraVertical(String sopa[][], String palabra, int fila, int columna) {

        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila + i][columna] = "" + palabra.charAt(i);
        }
    }

    public static void palabraDiagonal(String sopa[][], String palabra, int fila, int columna) {

        for (int i = 0; i < palabra.length(); i++) {
            sopa[fila + i][columna + i] = "" + palabra.charAt(i);
        }

    }
    
     public static void palabraDiagonalInvertida(String sopa[][], String palabra, int fila, int columna) {
        int contador=0;
        
        for (int i =0; i < palabra.length(); i++) {
            sopa[fila+i][columna-i] = "" + palabra.charAt(i);
            contador++;
        }

    }
     
     public static void rellena_sopa(String[][] sopa){
         Random random = new Random();
         int num;
         String letra ="";
         
         for (int i = 0; i < sopa.length; i++) {
             for (int j = 0; j < sopa.length; j++) {
                 if (sopa[i][j]== null) {
                     num = random.nextInt(9);
                     letra = Integer. toString(num);
                     sopa[i][j]= letra;
                     
                 }
             }
             
         }
     }

    public static void muestra_sopa(String[][] sopa) {

        System.out.println("Subproceso Muestra Sopa de Letras: ");
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                System.out.print("[ " + sopa[i][j] + " ]");
            }
            System.out.println("");
        }
        System.out.println(" ");
    }
}

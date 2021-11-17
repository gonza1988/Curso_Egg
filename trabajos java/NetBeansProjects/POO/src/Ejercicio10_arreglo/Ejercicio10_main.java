/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10_arreglo;

import java.util.Arrays;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio10_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
        A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
        programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
        pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
        10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
        elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
        elementos y el combinado de 20. */
        
        int[] arregloA = new int[50];
        int[] arregloB = new int[20];
        
        llenarVector(arregloA);
        mostrarVector(arregloA);
        Arrays.sort(arregloA);
        mostrarVector(arregloA);
        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB,10,20, 1);
        
        mostrarVector(arregloB);
        
    }
    
    //-----------FUNCION SIN RETORNO---------------------//
    public static void llenarVector(int[] cualquierVector) {
        System.out.println("Metodo llenado de vector: ");
        //Siempre para recorrer una MATRIZ, recorro con UN FOR por cada dimension ( En este caso, 1 para filas otro para columnas)
        for (byte i = 0; i < cualquierVector.length; i++) {
                cualquierVector[i] = (int)(Math.random() * 50); // Asigno a la posicion [i][j] un valor aleatorio
            
        }
    }
    
    //-----------FUNCION SIN RETORNO---------------------//
    public static void mostrarVector(int[] cualquierVector) {
        System.out.println("Metodo muestra vector: ");
        //Utilizo LENGTH para que sea dinamico, es decir, me va a servir sin importar de cuantas filas o columnas sea mi Matriz
        for (byte i = 0; i < cualquierVector.length; i++) {
                 System.out.print("[" + cualquierVector[i] + "]");
            }
            System.out.println(""); // Esto es para que luego de que termino de imprimir la FILA COMPLETA, haga un salto de linea (ENTER)
    }
    
    
}

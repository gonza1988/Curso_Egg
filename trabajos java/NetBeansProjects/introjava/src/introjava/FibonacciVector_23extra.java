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
public class FibonacciVector_23extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 23. Realizar un programa que complete un vector con los N primeros números de la
        sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
        los siguientes números:
        1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        Donde cada uno de los números se calcula sumando los dos anteriores a él. Por
        ejemplo:
        La sucesión del número 2 se calcula sumando (1+1)
        Análogamente, la sucesión del número 3 es (1+2),
        Y la del 5 es (2+3),
        Y así sucesivamente…
        La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
        Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
        Fibonaccin = 1 para todo n<=1
        Por lo tanto, si queremos calcular el término “n” debemos escribir una función que
        reciba como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int tope;
        System.out.println("Ingrese el tope de la sucesion Fibonacci: ");
        tope = leer.nextInt();
        int[] vector = new int [tope];
        
        System.out.println("Sucesion Fibonacci: ");fibonacci(vector);
    }
    
    public static void fibonacci(int[]vector){
        int a=0,b=1,c=0;
        
        for (int i = 0; i < vector.length; i++) {
            
            c = a+b;
            a = b;
            b = c;
            vector[i] = a;
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println(" ");
    }
}

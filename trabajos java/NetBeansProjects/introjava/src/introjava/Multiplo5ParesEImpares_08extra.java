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
public class Multiplo5ParesEImpares_08extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
        debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
        números pares y la cantidad de números impares. Al igual que en el ejercicio
        anterior los números negativos no deben sumarse. Nota: recordar el uso de la
        sentencia break */

        multiplo5();

    }

    public static void multiplo5() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 1, pares = 0, impares = 0, contador = 0;

        while (num % 5 != 0) {
            System.out.println("Ingrese numero a trabajar: ");
            num = leer.nextInt();

            if (num > 0) {
                contador++;

                if (num % 2 == 0) {
                    pares++;
                } else if (num % 2 != 0) {
                    impares++;
                } 
            else {
                    System.out.println("Numero menor a 0 ingresado ");
                }
            }

        }
        System.out.println("Cantidad de numeros ingresados: "+contador);
        System.out.println("Numeros pares ingresados "+pares);
        System.out.println("Numeros impares ingresados "+impares);
    }
}
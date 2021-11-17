/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_adivinaNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio04_adivinaNumeroMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Escribir un programa en Java que juegue con el usuario a adivinar un número. La
        computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
        que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
        computadora debe decirle al usuario si el número que tiene que adivinar es mayor
        o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
        indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
        adivinar el número. Si el usuario introduce algo que no es un número, se debe
        controlar esa excepción e indicarlo por pantalla. En este último caso también se
        debe contar el carácter fallido como un intento. */

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int adivina = (int) (Math.random() * 10 + 1), num = 0, cont = 0;

        do {
            try {

                System.out.println("Ingrese numero a adivinar");
                num = leer.nextInt();

                if (num < adivina) {

                    System.out.println("El numero ingresado es menor que Adivina,Reintente: ");
                    cont++;

                } else if (num > adivina) {

                    System.out.println("El numero ingresado es mayor que Adivina, Reintente: ");
                    cont++;
                }

            } catch (InputMismatchException e) {
                System.out.println("No ha ingresado un numero, Reintente: " + e.toString());
                cont++;
                leer.next();
            }

        } while (num != adivina);

        System.out.println("Numero " + adivina + " adivinado. Cantidad de intententos: " + (cont + 1));
    }

}

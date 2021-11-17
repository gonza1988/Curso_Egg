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
public class FuncionNumeroPrimo_16extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 16. Crea una aplicación que nos pida un número por teclado y con una función se lo
        pasamos por parámetro para que nos indique si es o no un número primo, debe
        devolver true si es primo, sino false.
        Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
        no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num = 0;
        System.out.println("Ingrese numero para determinar si es primo: ");
        num = leer.nextInt();

        if (es_primo(num) == true) {
            System.out.println("Su numero ES PRIMO");
        } else {
            System.out.println("Su numero NO ES PRIMO");
        }
    }

    public static boolean es_primo(int num) {
        boolean es_primo = true;
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador == 2) {
            es_primo = true;
        } else {
            es_primo = false;
        }

        return es_primo;
    }
}

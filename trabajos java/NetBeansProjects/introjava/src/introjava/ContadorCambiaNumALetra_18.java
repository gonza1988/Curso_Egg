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
public class ContadorCambiaNumALetra_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
        del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
        por una E. Ejemplo:
        0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        .
        0-1-2
        0-1-E
        Nota: investigar función equals() y como convertir números a String. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

       /* int num = 0, contador = 0;
        String convertidor = "";

        do {
            System.out.println("Ingrese numeros de 3 cifras y con numeros del 0 al 9 ");
            num = leer.nextInt();
            convertidor = Integer.toString(num);

            if (convertidor.length() != 3) {
                System.out.println("Contador mal ingresado , Reintente ");

            } else {
                System.out.println(convertidor.replace("3", "E"));
                contador = contador + 1;
            }
        } while (contador < 5);*/

        otraForma();
    }

    public static void otraForma() {
        String numCadena = "";
        int num = 0;

        for (int i = 0; i < 1000; i++) {
            num = i;
            numCadena = String.valueOf(num);

            if (numCadena.contains("3")==true) {

                System.out.println(numCadena.replace("3", "E"));
            } else {
                System.out.println(numCadena);
            }
        }

    }

}

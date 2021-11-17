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
public class FuncionMayoresMenores_15extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 15. Diseñe una función que pida el nombre y la edad de N personas e imprima los
        datos de las personas ingresadas por teclado e indique si son mayores o menores
        de edad. Después de cada persona, el programa debe preguntarle al usuario si
        quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
        “No */

        mayoromenor_edad();
    }

    public static void mayoromenor_edad() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad = 0;
        String nombre = "", respuesta = "";

        do {
            System.out.println("Ingrese nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese edad: ");
            edad = leer.nextInt();

            if (edad > 18) {
                System.out.println(nombre + " es mayor de edad! ");
            } else {
                System.out.println(nombre + " es menor de edad :( ");
            }
            
            System.out.println("¿Desea seguir evaluando personas? ");
            respuesta=leer.next();

        } while (!respuesta.equals("no"));
    }
}

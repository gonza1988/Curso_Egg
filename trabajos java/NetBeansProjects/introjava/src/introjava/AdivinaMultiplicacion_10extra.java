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
public class AdivinaMultiplicacion_10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 10. Realice un programa para que el usuario adivine el resultado de una multiplicación
        entre dos números generados aleatoriamente entre 0 y 10. El programa debe
        indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
        incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
        realizar este ejercicio investigue como utilizar la función Math.random() de Java. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double adivina,resul;

        do {

            System.out.println("Ingrese el resultado adivinado de la multiplicacion: ");
            adivina = leer.nextDouble();
            resul=resultado();
            System.out.println("Resultado de multiplicacion aleatoria: " + resul);

            if (resul == adivina) {
                System.out.println("FELICITACIONES, ADIVINASTE EL RESULTADO!!!");
            } else {
                System.out.println("NO ADIVINASTE EL RESULTADO, A SEGUIR INTENTANDO: ");
            }
        } while (resul != adivina);
    }

    public static double resultado() {
        double num1, num2;

        num1 = Math.floor(Math.random() * 11);
        num2 = Math.floor(Math.random() * 11);

        return num1 * num2;
    }
}

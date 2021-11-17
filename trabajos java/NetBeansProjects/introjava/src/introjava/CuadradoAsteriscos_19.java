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
public class CuadradoAsteriscos_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
        si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
        * * * *
        *     *
        *     *
        * * * * */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese tamaño del cuadrado deseado de 0 a 20 ");
        int tamaño = leer.nextInt();

        if (tamaño > 0 && tamaño < 20) {
            //Linea superior
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if (i > 0 && i < tamaño - 1 && j > 0 && j < tamaño - 1) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }

                }
                System.out.println("");
            }
        } else {
            System.out.println("Tamaño incorrecto del cuadrado, no podra verse correctamente ");
        }
    }

}

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
public class DobleTripleRaizcuadrada_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 6. Escribir un programa que lea un número entero por teclado y muestre por pantalla
        el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
        Math.sqrt(). */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        System.out.println("Ingrese numero a calcular");
        num = leer.nextInt();
       
        System.out.println("El doble del numero ingresado es " + num * 2 );
        System.out.println("El triple del numero ingresado es " + num * 3 );
        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
    }
    
}

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
public class suma2numeros_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*2. Escribir un programa que pida dos números enteros por teclado y calcule la suma
        de los dos. El programa deberá después mostrar el resultado de la suma */
        
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma;
        System.out.println("Ingrese dos numeros a sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("El resultado de la suma es: " + suma );
    }
    
}

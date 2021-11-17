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
public class SumaConLimiteWhile_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
        solicite números al usuario hasta que la suma de los números introducidos supere
        el límite inicial. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int limite, num, suma;
        System.out.println("Ingrese el limite a sumar");
        limite = leer.nextInt();
        suma = 0;
                
        while (limite > suma && limite >= 0) {
            System.out.println("Ingrese numero a sumar");
            num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma con limite es: " + suma);
        }
    }
    
}

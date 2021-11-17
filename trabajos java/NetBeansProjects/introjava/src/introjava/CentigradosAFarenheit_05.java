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
public class CentigradosAFarenheit_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
        grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double centigrados, Farenheit;
        System.out.println("Ingrese los grados centigrados a convertir a grados Farenheit");
        centigrados = leer.nextDouble();
        Farenheit = 32 + (9 *centigrados / 5);
        System.out.println("Sus grados convertidos a Farenheit son :" + Farenheit);
    }
    
}

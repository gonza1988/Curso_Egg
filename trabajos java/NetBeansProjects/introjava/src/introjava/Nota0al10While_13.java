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
public class Nota0al10While_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        la nota se pedirá de nuevo hasta que la nota sea correcta. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese nota del 1 al 10");
        int nota = leer.nextInt();
        
         while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        
        System.out.println("Nota correcta");
            
        }

    }
    


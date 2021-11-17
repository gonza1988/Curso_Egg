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
public class NumeroARomano_04extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        
        System.out.println("Ingrese numero a convertir a ROMANO: ");
        num=leer.nextInt();
        muestra_romano(num);
    }
                
    public static void muestra_romano(int num){
        
        switch (num) {
                  
                   case 1:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = I");
                       break;
                   case 2:
                       System.out.println("\n");
                      System.out.println("Su numero "+num+" convertido a ROMANO ES = II");
                       break;  
                   case 3:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = III");
                       break;
                   case 4:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = IV");
                       break;
                  case 5:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = V");
                       break;
                  case 6:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = VI");
                       break;  
                  case 7:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = VII");
                       break; 
                  case 8:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = VIII");
                       break;
                  case 9:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = IX");
                       break;
                  case 10:
                       System.out.println("\n");
                       System.out.println("Su numero "+num+" convertido a ROMANO ES = X");
                       break; 
                  default:
                      System.out.println("\n");
                      System.out.println("El numero ingresado no está todavia en nuestro programa");     
               }
   }
}
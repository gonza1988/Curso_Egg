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
public class NumeroConAsteriscos_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
        número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
        5 *****
        3 ***
        11 ***********
        2 ** */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num = 0, contador = 0;
        
        do {
            System.out.println("\n");
            System.out.println("Ingrese numero del 1 al 20");
            num = leer.nextInt();
            
            if(num<1 || num>20){
               System.out.println("Numero mal ingresado, REINTENTE");
            }else {
                for(int i = 0; i<num; i++){
                        System.out.print("*");
                        
                
                }
                contador = contador +1;
            }
            
        }while (contador<4);
    }
    
}

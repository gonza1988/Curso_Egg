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
public class IfMayoroMenor_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 7. Implementar un programa que dado dos números enteros determine cuál es el
        mayor y lo muestre por pantalla */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num1, num2;
        System.out.println("Ingrese 2 numeros a comparar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > num2){
            
            System.out.println("Nummero 1 " + num1 + " es mayor que numero 2 " + num2);
            
           } else if(num1 < num2) {

             System.out.println("Nummero 2 " + num2 + " es mayor que numero 1 " + num1);
        
           } else if(num1 == num2) {

             System.out.println("Los numeros son iguales " + num1 + " = " + num2);
             
             
             
        } 
        mayorMenor(num1,num2);
    }
    
    public static void mayorMenor(int num1,int num2){
        
        
        System.out.println("El numero mayor entre "+num1+" y "+num2+" es: "+Math.max(num1,num2));
        System.out.println("El numero menor entre "+num1+" y "+num2+" es: "+Math.min(num1,num2));
    }
}

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
public class MaximoYMinimo_07extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
        promedio de n números (n>0). El valor de n se solicitará al principio del programa y
        los números serán introducidos por el usuario. Realice dos versiones del programa,
        una usando el bucle “while” y otra con el bucle “do - while”. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num,contador=0,suma=0,max=0,min=1000;
        
        //Bucle DO-WHILE
        do{
            System.out.println("Ingrese numeros DISTINTOS A 0 para calcular: ");
            num=leer.nextInt();
            
            suma += num;
            contador ++;
            
            if(max<=num && num != 0){
                max= num;
            }if (num<min && num !=0){
                min=num;
            }
        }while(num != 0);
        
        System.out.println("El valor MAXIMO ingresado es: "+max);
        System.out.println("El valor MINIMO ingresado es: "+min);
        System.out.println("El PROMEDIO de valores ingresados es: "+suma/(contador-1));
        
        MaxMim_while();
    }
    public static void  MaxMim_while(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int max=0,min=1000,num,n,suma=0,contador=0;
        
        System.out.println("Ingrese la cantidad de numeros a trabajar: ");
        n = leer.nextInt();
        
        while(contador<n){
            System.out.println("Ingrese numero: ");
            num=leer.nextInt();
            if(num>0){
                suma+=num;
                contador++;
            }
            if(max<=num && num != 0){
                max= num;
            }if (num<min && num !=0){
                min=num;
            }
        }
        System.out.println("El valor MAXIMO ingresado es: "+max);
        System.out.println("El valor MINIMO ingresado es: "+min);
        System.out.println("El PROMEDIO de valores ingresados es: "+suma/(contador));
    }
}

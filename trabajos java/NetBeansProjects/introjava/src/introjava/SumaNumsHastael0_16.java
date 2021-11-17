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
public class SumaNumsHastael0_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
        salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
        deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
        número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num, suma,contador;
        suma = 0;
        contador = 0;
        
        do {
            System.out.println("Ingrese 20 numeros a sumar");
            num = leer.nextInt();
            contador = contador +1;
            
            if (num == 0) {
                System.out.println("Se capturo el numero cero "); 
                System.out.println("La suma de los numeros ingresados al momento es de : " + suma);
                break;
            }  else if (num < 0){
                System.out.println("Numero negativo ingresado, no sera sumado ");
                suma = suma;
                     
            } else {
                suma = suma + num;
                System.out.println("La suma de los valores ingresados es de: " + suma);    
                }
            
        } while ((contador < 20) || (num == 0));
    }
    
}

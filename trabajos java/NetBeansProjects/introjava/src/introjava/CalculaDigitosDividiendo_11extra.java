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
public class CalculaDigitosDividiendo_11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 11. Escribir un programa que lea un número entero y devuelva el número de dígitos
        que componen ese número. Por ejemplo, si introducimos el número 12345, el
        programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
        utilizando el operador de división. Nota: recordar que las variables de tipo entero
        truncan los números o resultados */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int numero;
        System.out.println("Ingrese numero a evaluar la cantidad de digitos: ");
        numero = leer.nextInt();
        
        System.out.println("Su numero tiene: "+cuenta_digitos(numero)+" digitos");
    }
    
    public static int cuenta_digitos(int numero){
        
        int cuenta_digitos=0;
        double resto=0;
        
        while(numero>0){
            resto = numero % 10;
            numero= numero/10;
            cuenta_digitos++;
        }
        return cuenta_digitos;
    }
}

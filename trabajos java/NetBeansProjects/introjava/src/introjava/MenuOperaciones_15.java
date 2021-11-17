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
public class MenuOperaciones_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 15. Realizar un programa que pida dos números enteros positivos por teclado y
        muestre por pantalla el siguiente menú:
              MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:
        El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
        pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
        opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
        del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
        ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
        carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros a operar en el menu");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        int opcion = 0;
        String confirma = " ";
        
        do {
           System.out.println("****** Menu ****** \n");
           System.out.println("1.Sumar");
           System.out.println("2.Restar");
           System.out.println("3.Multiplicar");
           System.out.println("4.Dividir");
           System.out.println("5.Salir \n");
           System.out.println("Elija una opcion");
           opcion=leer.nextInt();
           
           switch (opcion) {
                  
                   case 1:
                       System.out.println("\n");
                       System.out.println("La suma de los numero es igual a: " + (num1 + num2));
                       break;
                   case 2:
                       System.out.println("\n");
                       System.out.println("La resta de los numero es igual a: " + (num1 - num2));
                       break;  
                   case 3:
                       System.out.println("\n");
                       System.out.println("La Multiplicacion de los numero es igual a: " + (num1 * num2));
                       break;
                   case 4:
                       System.out.println("\n");
                       System.out.println("La Division de los numero es igual a: " + (num1 / num2));
                       break;
                   case 5:
                       if (opcion == 5){
                           System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                           confirma = leer.next();
                           confirma = confirma.toLowerCase();
                       }
                       if (confirma.equals("s") == true){
                           break;
                       } else {
                           opcion = 0;
                          
                       }
                         
               }
          
        } while (opcion != 5);
    
    
        }
        }
        
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
public class MenuOperacionesFunciones_14extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 14. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
        sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
        operación matemática y deben devolver sus resultados para imprimirlos en el main. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese 2 numeros a operar en el menu");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
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
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n");
                    System.out.println("La suma de los numero es igual a: " + suma(num1, num2));
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("La resta de los numero es igual a: " + resta(num1, num2));
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("La Multiplicacion de los numero es igual a: " + multiplica(num1, num2));
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("La Division de los numero es igual a: " + divide(num1, num2));
                    break;
                case 5:
                    if (opcion == 5) {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        confirma = leer.next();
                    }
                    if (confirma.equals("s") == true) {
                        break;
                    } else {
                        opcion = 0;

                    }
            }

        } while (opcion != 5);
    }
  
    public static int suma(int num1, int num2){
        int suma=0;
        
        suma = num1+num2;
        return suma;
    }
    
     public static int resta(int num1, int num2){
        int resta=0;
        
        resta = num1-num2;
        return resta;
    }
     
      public static int multiplica(int num1, int num2){
        int multiplica=0;
        
        multiplica = num1*num2;
        return multiplica;
    }
      
       public static double divide(int num1, int num2){
        double divide=0.0;
        
        divide = num1/num2;
        return divide;
    }
}

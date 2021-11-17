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
public class MotorSwitch_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 12. Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba” */
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       System.out.println("Ingrese tipo numerico de motor");
       int tipoMotor = leer.nextInt(); 
       
       switch (tipoMotor){
           case 1:
               System.out.println("La bomba es una bomba de AGUA");
               break;
           case 2:
               System.out.println("La bomba es una bomba de GASOLINA");
               break;
           case 3:
              System.out.println("La bomba es una bomba de HORMIGON");
              break;
           case 4:
               System.out.println("La bomba es una bomba de PASTA ALIMENTICIA");
               break;
           default:
                System.out.println("No existe un valor valido para esta bomba ");    
       }
    }
    
}

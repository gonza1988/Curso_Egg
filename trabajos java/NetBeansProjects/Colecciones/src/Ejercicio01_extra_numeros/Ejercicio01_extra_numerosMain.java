/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_numeros;

import Ejercicio01_extra_numeros.servicios.ServicioEntidadNumero;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio01_extra_numerosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
         y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
         introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
         programa mostrará por pantalla el número de valores que se han leído, su suma y su
         media (promedio). */
        
        ServicioEntidadNumero servNum = new ServicioEntidadNumero();
        
        servNum.crearNumero();
        servNum.mostrarNumero();
        System.out.println("La suma de los numeros de la lista es igual a : "+servNum.sumaNumero());
        System.out.println("El promedio de los numeros de la lista es igual a : "+servNum.mediaNumero());
        
    }
    
}

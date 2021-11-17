/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01_extra_numeros.servicios;

import Ejercicio01_extra_numeros.entidades.EntidadNumero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioEntidadNumero {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<EntidadNumero> numeros;

    public ServicioEntidadNumero() {
        this.numeros = new ArrayList();
    }

    public void crearNumero() {

        int numero = 0;

        do {

            System.out.println("Ingrese numero a la lista:"); // Pedimos los datos del objeto
            numero = leer.nextInt();

            if (numero != -99) {

                numeros.add(new EntidadNumero(numero));

            }

        } while (numero != -99);

    }

    public void mostrarNumero() {

        System.out.println("Las numeros ingresados a la lista son: ");

        for (EntidadNumero aux : numeros) {

            System.out.println(aux.toString());
        }

        System.out.println("Cantidad lista:" + numeros.size());
    }
    
    public int sumaNumero(){
        int suma = 0;
        
       // System.out.println("La suma de los numeros ingresados a la lista es igual a :");
        
        for (EntidadNumero aux : numeros) {

            suma = suma + aux.getNumero();
        }
        
        return suma;
    }

    public double mediaNumero(){
        double promedio = 0;
        
        //System.out.println("El promedio de los numeros ingresados a la lista es igual a :");
        
        promedio =(double) sumaNumero()/ numeros.size();
        
        return promedio;
    }
}

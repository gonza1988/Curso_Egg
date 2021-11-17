/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11_date;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class Ejercicio11_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 11.
        Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
        la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
        clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
        pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
        de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
        fecha actual, que se puede conseguir instanciando un objeto Date con constructor
        vacío.
        Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
        Ejemplo fecha actual: Date fechaActual = new Date();  */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int anio, mes, dia;

        System.out.println("Ingrese año /AAAA , a su clase DATE: ");
        anio = leer.nextInt()-1900;
        System.out.println("Ingrese mes /mm , a su clase DATE: ");
        mes = leer.nextInt()-1;
        System.out.println("Ingrese dia /dd , a su clase DATE: ");
        dia = leer.nextInt();
        
        Date fecha = new Date(anio,mes,dia);
        Date fechaActual = new Date();
        System.out.println("fecha actual "+fechaActual.toString());
        System.out.println("fecha ingresada "+fecha.toString());
        System.out.println("La diferencia entre el año ingresado y el actual es de: "+diferenciaAño(fecha.getYear(),fechaActual.getYear()));

    }

    public static int diferenciaAño(int año, int añoActual){
        
        int diferencia = añoActual - año;
        return diferencia;
    }
}

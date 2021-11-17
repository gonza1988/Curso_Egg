/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio04_extra_NIF.servicios;

import Ejercicio04_extra_NIF.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioNIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static char[] vectorLetra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};


     
    
    public void crearNif(NIF personax){
        
        System.out.println("Bienvenido al sistema de Creacion de su NIF: ");
        System.out.println("Por favor, ingrese su numero de dni sin puntos ni comas: ");
        long dni = leer.nextLong();
        
        while (dni < 999999 || dni > 99999999){
            System.out.println("Dni mal ingresado, Reintente: ");
            dni = leer.nextLong();
        }
        personax.setdni(dni);
        personax.setLetra(asignarLetra(personax));
        
    }
    
   
    
    private char asignarLetra(NIF personax){
         long letraNif = personax.getdni()%23;
         char letra = 's';
         
        for (int i = 0; i < vectorLetra.length; i++) {
            if (letraNif == i) {
                letra = vectorLetra[i];
            }
        }
        
       return letra;
    }
    
    public void mostrar(NIF personax){
        
        System.out.println("Nif de la persona ingresada: "+personax.getdni()+"-"+personax.getLetra());
    }
    
}

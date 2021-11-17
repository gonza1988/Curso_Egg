/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio05_extra_meses.servicios;

import Ejercicio05_extra_meses.entidades.Meses;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gonza Cozzo
 */
public class ServicioMeses {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
 
     public void mostrarMeses(Meses mes) {

        for (int i = 0; i < mes.getMeses().length; i++) {

            System.out.print("[" + mes.getMeses()[i] + "]");
        }
    }
     
     public void jugar(Meses mes){
         
         mostrarMeses(mes);
         System.out.println("");
         System.out.println("Ingrese mes a adivinar: ");
         String adivina = leer.next().toLowerCase();
         
         
         while(!(mes.getMesSecreto().equals(adivina))){
         
             System.out.println("¡No has acertado, intenta nuevamente!");
             adivina = leer.next().toLowerCase();
     }
         System.out.println("¡Has acertado, Felicitaciones!");
     }
    
}

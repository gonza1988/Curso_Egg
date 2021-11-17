/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorpractica;

import integradorpractica.servicios.ServicioPractica;

/**
 *
 * @author Gonza Cozzo
 */
public class IntegradorPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPractica sp = new ServicioPractica();
        
//        System.out.println(sp.compruebaNumero(18));
//        System.out.println(sp.cadena("hola mundo"));

         System.out.println(sp.parCieloPiso(2, 2, -3));
         System.out.println(sp.geringoso("hola"));
         System.out.println(sp.inversa("Hola")); 
    }
    
}

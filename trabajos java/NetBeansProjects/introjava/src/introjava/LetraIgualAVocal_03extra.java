/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class LetraIgualAVocal_03extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
        vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
        clase String.  */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        String l;
        System.out.println("Ingrese una letra a evaluar");
        l = leer.next();
        
        encuentra_vocal(l);
    }
    public static void encuentra_vocal(String l){
        l = l.toLowerCase();
        
        if(l.equals("a")==true || l.equals("e")==true || l.equals("i")==true || l.equals("o")==true || l.equals("u")==true ){
            System.out.println("SU LETRA SI ES UNA VOCAL");
           }else {
            System.out.println("SU LETRA NO ES UNA VOCAL");
        }
    }
}

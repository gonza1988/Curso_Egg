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
public class MediaEdadHijos_13extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 13. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
        cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
        cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
        todas las familias */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int familias, hijos;
        System.out.println("Ingrese la cantidad de familias a evaluar: ");
        familias = leer.nextInt();
        
        System.out.println("La media de las "+familias+" familias ingresadas es = "+calcula_media(familias));
    }
    
    public static double calcula_media(int familia){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double calcula_media=0,cuenta_hijos=0;
        int hijos=0,edad;
        
        for (int i = 0; i < familia; i++) {
            System.out.println("Ingrese cantidad de hijos. Familia "+i+" ");
            hijos=leer.nextInt();
            edad=0;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad de su hijo: "+j+" ");
                edad=leer.nextInt();
                calcula_media = calcula_media + edad;
                cuenta_hijos++;
            }
           
        }
        calcula_media = calcula_media/cuenta_hijos;
        return calcula_media;
    }
}

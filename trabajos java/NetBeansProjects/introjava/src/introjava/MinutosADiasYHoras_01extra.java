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
public class MinutosADiasYHoras_01extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
        el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
        horas. */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int minutos;
        System.out.println("Ingrese los minutos a saber: ");
        minutos = leer.nextInt();
        
        dias_horas(minutos);
        
    }
    public static void dias_horas(int minutos){
        float dias=0,horas=0;
        
        dias = minutos /1440;
        horas = minutos%1440 /60;
        System.out.println("Dias: "+ dias);
        System.out.println("Horas: "+ horas);
    }
}
